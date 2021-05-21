package com.dragontalker.java;

import org.junit.Test;

/**
 * 如何自定义泛型结构:
 */

public class GenericTest1 {
    @Test
    public void test1() {
        //如果定义了泛型类, 实例化没有指明类的泛型, 则认为此泛型类为Object类
        //要求: 如果大家定义了类是带泛型的, 建议在实例化时要指明类的泛型
        //建议: 实例化时指明类的泛型
        Order<String> order = new Order<>("AA", 1001, "orderAA");
        order.setOrderT("Order: AA");
    }
}
