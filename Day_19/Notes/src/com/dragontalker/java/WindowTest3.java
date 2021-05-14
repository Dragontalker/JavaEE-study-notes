package com.dragontalker.java;

/*
使用同步方法解决实现Runnable接口的线程安全问题
 */

class Window3 implements Runnable {
    private static int ticket = 100;

    @Override
    public void run() {
        while(ticket > 0) {
            show();
        }
    }

    private synchronized void show() {//同步监视器: this
        if (ticket > 0) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ": 卖票, 票号为: " + ticket);
            ticket--;
        }
    }
}

public class WindowTest3 {
    public static void main(String[] args) {
        Window3 w = new Window3();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.start();
        t2.start();
        t3.start();
    }
}