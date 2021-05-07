package com.dragontalker;

public class ValueTransferTest {
    public static void main(String[] args) {

        // 基本数据类型
        int m = 10;
        int n = m;
        System.out.println(" m = " + m + " n = " + n);
        m = 20;
        System.out.println(" m = " + m + " n = " + n);

        // 引用数据类型
        Order o1 = new Order();
        o1.orderId = 1001;

        Order o2 = o1;
        System.out.println("o1.orderId = " + o1.orderId + ", o2.orderId = " + o2.orderId);

        o2.orderId = 1002;
        System.out.println("o1.orderId = " + o1.orderId + ", o2.orderId = " + o2.orderId);
    }
}

class Order {
    int orderId;
}
