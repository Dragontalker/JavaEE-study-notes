package com.dragontalker.java3;

import org.junit.Test;

/**
 * 1. Stream关注的是对数据的运算, 与CPU打交道
 *    集合关注的是数据的存储, 和内存打交道
 *
 * 2. Stream
 *      - 自己不会存储数据
 *      - 不会改变源对象, 相反, 他们会返回一个持有结果的新Stream
 *      - 操作是延迟执行的, 这意味着他们会等到需要结果的时候才执行
 *
 * 3. Stream的执行流程
 *      1) Stream的实例化
 *      2) 一系列的中间操作(过滤、映射...)
 *      3) 终止操作
 *
 * 4. 说明:
 *      1) 一个操作链, 对数据源的数据进行处理
 *      2) 一旦执行终止操作, 就执行中间操作链, 并产生结果, 之后, 不会再被使用
 */

public class StreamAPITest {

    //创建Stream方式之一: 通过集合
    @Test
    public void test1() {

    }
}
