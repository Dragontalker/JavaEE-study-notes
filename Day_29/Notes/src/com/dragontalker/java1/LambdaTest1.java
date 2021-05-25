package com.dragontalker.java1;

import org.junit.Test;

/**
 * Lambda表达式的使用
 *
 * 1. 举例: (o1, o2) -> Integer.compare(o1, o2);
 *
 * 2. 格式:
 *  -> : Lambda操作符 或 箭头操作符
 *  ->的左边: Lambda形参列表(其实就是接口中的抽象方法的形参列表)
 *  ->的右边: Lambda体(其实就是重写的抽象方法的方法体)
 *
 * 3. Lambda表达式的使用: (分为6种情况)
 *
 * 4. Lambda表达式的本质: 作为接口的实例
 */

public class LambdaTest1 {
    //语法格式1: 无参, 无返回值
    @Test
    public void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };
        r1.run();

        //使用Lambda表达式重写
        //作为Runnable接口的实例
        Runnable r2 = () -> System.out.println("我爱北京故宫");
        r2.run();
    }

    //语法格式二: Lambda需要一个参数, 但是没有返回值
    @Test
    public void test2() {

    }
}
