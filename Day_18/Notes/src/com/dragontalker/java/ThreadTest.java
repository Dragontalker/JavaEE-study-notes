package com.dragontalker.java;

/*
多线程的创建, 方式一: 继承于Thread类
    1. 创建一个继承于Thread类的子类
    2. 重写Thread类的run()方法 ---> 将此线程执行的操作声明在run()中
    3. 创建Thread类的子类的对象
    4. 通过此对调用start()方法

例子: 遍历100以内的所有的偶数
 */

class MyThread extends Thread {
    //2. 重写Thread类的run()方法

    @Override
    public void run() {
        for (int i =0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println("Running on: "+ Thread.currentThread().getName() + ", Output: " + i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        //3. 创建Thread类的子类的对象
        MyThread myThread1 = new MyThread();

        //4. 通过此对调用start()方法
        //  1) 启动当前线程
        //  2) 调用当前线程的run()
        myThread1.start();

        //问题一: 我们不能通过直接调用run()的方式启动线程
        //t1.run();

        //问题二: 再启动一个线程, 遍历100以内的偶数, 不可以让已经start()的线程去执行
        //会报IllegalThreadException
        //myThread.start();
        MyThread myThread2 = new MyThread();
        myThread2.start();

        //如下操作仍然是在main线程中执行的
        for (int i =0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println("Running on: "+ Thread.currentThread().getName() + ", Output: " + i);
            }
        }
    }
}
