package com.dragontalker.java1;

import org.junit.Test;

import java.util.function.Consumer;

/**
 * Java内置的4大核心函数式接口
 *
 * 1. 消费型接口 Consumer<T> void accept(T t)
 *
 * 2. 供给型接口 Supplier<T> T get()
 *
 * 3. 函数型接口 Function<T, R> R apply(T t)
 *
 * 4. 断定型接口 Predicate<T> boolean test(T t)
 */

public class LambdaTest2 {

    @Test
    public void test1() {

    }

    public void happyTime(double money, Consumer<Double> con) {
        con.accept(money);
    }
}
