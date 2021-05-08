package com.dragontalker;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderDefault = 1;
        order.orderPublic = 2;
        //order.orderPrivate = 3; 出了Order类之后, 私有的结构就不可调用了
    }
}

