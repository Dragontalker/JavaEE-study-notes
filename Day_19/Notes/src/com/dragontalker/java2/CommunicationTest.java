package com.dragontalker.java2;

/*
线程通信的例子: 使用两个线程打印 1-100. 线程1, 线程2, 交替打印

涉及到的三个方法:
wait(): 一旦执行此方法, 当前线程就进入阻塞状态, 并释放同步监视器
notify(): 一旦执行此方法, 就会唤醒被wait的一个线程. 如果有多个线程被wait, 就唤醒优先级高的那个
notifyAll(): 一旦执行此方法, 就唤醒所有被wait的线程

说明:
1. wait(), notify(), notifyAll()这三个方法必须使用在同步代码块或同步方法中
2. wait(), notify(), notifyAll()这三个方法的调用者必须是同步代码块或同步方法中的同步监视器
    否则, 会出现IllegalMonitorStateException异常

 */

class Number implements Runnable {
    private int number = 1;
    private Object obj = new Object();

    @Override
    public void run() {
        while(true) {
            synchronized (obj) {

                obj.notifyAll();

                if (number <= 100) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() +
                            ": " + number++);

                    try {
                        //使得调用如下wait()方法的线程进入阻塞状态
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    break;
                }
            }
        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();

        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);
        Thread t3 = new Thread(number);
        Thread t4 = new Thread(number);
        Thread t5 = new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");
        t3.setName("线程3");
        t4.setName("线程4");
        t5.setName("线程5");


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
