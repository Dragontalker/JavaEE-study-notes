package com.dragontalker.java1;

import org.junit.Test;

/**
 * Lambda表达式的使用举例
 */

public class LambdaTest {

    @Test
    public void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };

        r1.run();
    }
}
