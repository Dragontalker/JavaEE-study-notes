package com.dragontalker.java2;

/*
创建线程的方式四: 使用线程池
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        service.execute(); //适合使用于Runnable
        service.submit(); //适合使用于Callable
    }
}
