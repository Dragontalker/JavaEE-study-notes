package com.dragontalker.java2;

/*
线程通信的例子: 使用两个线程打印 1-100. 线程1, 线程2, 交替打印
 */

class Number implements Runnable {
    private int number = 1;

    @Override
    public void run() {
        while(true) {
            if (number <= 100) {
                System.out.println(Thread.currentThread().getName() +
                        ": " + number++);
            } else {
                break;
            }
        }
    }
}

public class CommunicationTest {
}
