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
        ExecutorService service = Executors.newFixedThreadPool(10);

        service.execute(new OddThread()); //适合使用于Runnable
        service.execute(new EvenThread()); //适合使用于Callable

        service.shutdown();
    }
}
