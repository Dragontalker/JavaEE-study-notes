package com.dragontalker.java;

/**
 * 自定义泛型类
 */

public class Order<T> {
    String orderName;
    int orderId;

    //类的内部结构就可以使用类的泛型
    T orderT;

    public Order() {}

    public Order(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }

    //静态方法中不能使用类的泛型
//    public static void show(T orderT) {
//        System.out.println(orderT);
//    }

    //也不可以, 编译不通过
//    public void show() {
//        try {
//
//        }catch (T t) {
//
//        }
//    }
}
