package com.dragontalker.java2;

/*
线程通信的例子: 使用两个线程打印 1-100. 线程1, 线程2, 交替打印

涉及到的三个方法:
wait(): 一旦执行此方法,
 */

class Number implements Runnable {
    private int number = 1;

    @Override
    public void run() {
        while(true) {
            synchronized (this) {

                notifyAll();

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
                        wait();
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
