package com.dragontalker.java2;

/*
创建线程的方式三: 实现Callable接口 --- JDK5.0新增
 */

import java.util.concurrent.Callable;

class NumThread implements Callable {

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

public class ThreadNew {
}
