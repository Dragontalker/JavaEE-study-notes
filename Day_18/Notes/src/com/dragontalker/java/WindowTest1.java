package com.dragontalker.java;

/*
例子: 创建三个窗口卖票, 总票数为100张, 使用实现Runnable接口的方式
 */

class Window1 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while(true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ": 卖票, 票号为: " + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}

public class WindowTest1 {
}
