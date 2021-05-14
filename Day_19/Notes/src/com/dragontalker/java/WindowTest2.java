package com.dragontalker.java;

/*
使用同步代码块
 */

class Window2 extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while(true) {
            synchronized (this) {
                if (ticket > 0) {

//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

                    System.out.println(Thread.currentThread().getName() + ": 卖票, 票号为: " + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowTest2 {
    public static void main(String[] args) {
        Window2 w = new Window2();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.start();
        t2.start();
        t3.start();
    }
}
