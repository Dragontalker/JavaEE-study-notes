package com.dragontalker.java;

/*
使用同步方法解决事项Runnable接口的线程安全问题

关于同步方法的总结:
1. 同步方法仍然涉及到同步监视器, 只是不需要我们显式的声明
2. 非静态的同步方法, 同步监视器是: this
3. 静态的同步方法, 同步监视器是: 当前类本身
 */

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