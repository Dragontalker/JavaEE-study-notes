package com.dragontalker.java;

/*
例子: 创建三个窗口卖票, 总票数为100张, 使用实现Runnable接口的方式

1. 问题: 卖票过程中, 出现了重票、错票 ---> 出现了线程安全问题
2. 问题出现的原因: 当某个线程操作车票的过程中, 尚未完成操作时, 其他线程参与进来, 也操作车票
3. 如何解决:
    - 当一个线程在操作ticket的时候, 其他线程不能参与进来.
    - 直到线程a操作完ticket的时候, 其他线程才可以开始操作ticket.
    - 这种情况即使线程a出现了阻塞, 也不能被改变.
 */

class Window1 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while(true) {
            if (ticket > 0) {

//                try {
//                    Thread.sleep(200);
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

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.start();
        t2.start();
        t3.start();
    }
}
