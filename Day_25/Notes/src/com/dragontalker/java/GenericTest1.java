package com.dragontalker.java;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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

    @Test
    public void test2() {
        //由于子类在继承带泛型的父类时, 指明了泛型类型.
        //则实例化子类对象时, 不再指明泛型类型.
        SubOrder subOrder = new SubOrder();
        subOrder.setOrderT(1122);
        System.out.println(subOrder.getOrderT());
    }

    @Test
    public void test3() {
        SubOrder1<String> subOrder1 = new SubOrder1<>();
        subOrder1.setOrderT("Hello world!");
        System.out.println(subOrder1.getOrderT());
    }

    //测试泛型方法
    @Test
    public void test4() {
        Order<String> order = new Order<>();
        Integer[] arr = new Integer[]{1, 2, 3, 4};
        //泛型方法在调用时, 指定泛型参数的类型
        List<Integer> list = order.copyFromArrayToList(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
    }
}
