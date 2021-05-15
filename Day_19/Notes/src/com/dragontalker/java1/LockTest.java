package com.dragontalker.java1;

/*
解决线程安全问题的方式三: Lock锁 --- JDK5.0新增

 */

class Window implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {
        while(true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() +
                        ": 售票, 票号为: " + ticket--);
            } else {
                break;
            }
        }
    }
}

public class LockTest {
}
