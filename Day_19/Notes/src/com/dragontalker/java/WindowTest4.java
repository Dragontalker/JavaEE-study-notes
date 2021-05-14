package com.dragontalker.java;

class Window4 extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while(ticket > 0) {
            show();
        }
    }

    private static synchronized void show() {//同步监视器: Window4.class
        //private static synchronized void show() {//同步监视器: w1, w2, w3, 错误的方法
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

public class WindowTest4 {
    public static void main(String[] args) {
        Window4 w1 = new Window4();
        Window4 w2 = new Window4();
        Window4 w3 = new Window4();

        w1.start();
        w2.start();
        w3.start();
    }
}