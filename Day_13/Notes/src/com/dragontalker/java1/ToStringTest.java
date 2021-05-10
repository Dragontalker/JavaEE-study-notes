package com.dragontalker.java1;

/*
Object类中toString()的使用:

 */

public class ToStringTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Tom", 22);
        System.out.println(c1.toString());
        System.out.println(c1);

        String str = new String("MM");
        System.out.println(str);
    }
}
