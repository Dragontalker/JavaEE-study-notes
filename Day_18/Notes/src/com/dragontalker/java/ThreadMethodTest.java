package com.dragontalker.java;

/*
测试Thread中的常用方法:
    1. start(): 启动当前线程: 调用当前线程的run()
    2. run(): 通常需要重写Thread类中的此方法, 将创建的线程要执行的操作声明在此方法中
    3. currentThread(): 静态方法, 返回执行当前代码的线程
    4. getName(): 获取当前线程的名字
    5. setName(): 设置当前线程的名字
 */

class HelloThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread t1 = new HelloThread();
        t1.setName("线程一");
        t1.start();

        //给主线程命名
        Thread.currentThread().setName("主线程");

        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}
