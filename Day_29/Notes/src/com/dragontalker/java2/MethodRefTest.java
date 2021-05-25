package com.dragontalker.java2;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * 方法引用的使用
 *
 * 1. 使用情景: 当要传递给Lambda体的操作, 已经有实现的方法了, 可以使用方法引用
 *
 * 2. 方法引用, 本质上就是Lambda表达式, 而Lambda表达式作为函数式接口的实例
 *     所以方法引用, 也是函数式接口的实例
 */

public class MethodRefTest {

    //情况一: 对象 :: 实例方法
    //Consumer中的void accept(T t)
    //PrintStream中的void println(T t)
    @Test
    public void test1() {
        Consumer<String> con1 = str -> System.out.println(str);
        con1.accept("北京");

        System.out.println("************");

        Consumer<String> con2 = System.out :: println;
    }
}
