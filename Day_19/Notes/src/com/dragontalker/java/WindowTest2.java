package com.dragontalker.java;

/*
使用同步代码块
    - 如果使用多个subclass, 那么定义 private static Object lock = new Object();
    - 如果使用Runnable interface, 用this所谓线程锁

说明: 在继承Thread类创建多线程的方式中, 慎用this充当同步监视器
    - 我们可以考虑使用当前类充当同步监视器
 */

class Window2 implements Runnable {
    private static int ticket = 100;

    @Override
    public void run() {
        while(true) {
            //Window2只会加载一次
            synchronized (Window2.class) {//Class clazz = Window2.class
                if (ticket > 0) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

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
