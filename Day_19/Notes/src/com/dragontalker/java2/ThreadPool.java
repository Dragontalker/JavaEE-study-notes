package com.dragontalker.java2;

/*
创建线程的方式四: 使用线程池
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class EvenThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 ==0) {
                System.out.println(Thread.currentThread().getName() + "---" + i);
            }
        }
    }
}

class OddThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 !=0) {
                System.out.println(Thread.currentThread().getName() + "---" + i);
            }
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        //1. 提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);

        //2. 执行指定的线程操作, 需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new OddThread()); //适合使用于Runnable
        service.execute(new EvenThread()); //适合使用于Callable
        //service.submit(Callable callable);

        //3. 关闭连接池
        service.shutdown();
    }
}
