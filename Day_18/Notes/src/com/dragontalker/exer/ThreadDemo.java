package com.dragontalker.exer;

/*
练习: 创建两个分线程, 其中一个线程遍历100以内的偶数, 另一个线程遍历100以内的奇数
 */

class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i =0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println("Running on: "+ Thread.currentThread().getName() + ", Output: " + i);
            }
        }
    }
}

public class ThreadDemo {
}
