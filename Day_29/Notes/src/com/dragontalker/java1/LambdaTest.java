package com.dragontalker.java1;

import org.junit.Test;

/**
 * Lambda表达式的使用举例
 */

public class LambdaTest {

    @Test
    public void testOriginal() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };

        r1.run();
    }

    //使用Lambda表达式重写
    @Test
    public void testLambda() {
        Runnable r1 = () -> System.out.println("我爱北京故宫");
        r1.run();
    }
}
