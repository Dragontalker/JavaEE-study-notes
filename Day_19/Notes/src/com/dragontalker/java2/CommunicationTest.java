package com.dragontalker.java2;

/*
线程通信的例子: 使用两个线程打印 1-100. 线程1, 线程2, 交替打印
 */

class Number implements Runnable {
    private int number = 1;

    @Override
    public void run() {
        while(true) {
            synchronized (this) {
                if (number <= 100) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() +
                            ": " + number++);
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

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
