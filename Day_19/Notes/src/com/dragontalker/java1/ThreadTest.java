package com.dragontalker.java1;

/*
演示线程死锁问题
 */

public class ThreadTest {

    public static void main(String[] args) {

        new Thread(){
            @Override
            public void run() {}
        }.start();
    }
}
