package com.dragontalker.java1;

/*
Object类中toString()的使用:

1. 当我们输出一个对象的引用时, 实际上就是调用当前对象的toString()

2. Object类中toString()的定义:
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

3. 像String, Date, File, 包装类等都重写了Object类中的toString()方法

 */

import java.util.Date;

public class ToStringTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Tom", 22);
        System.out.println(c1.toString());
        System.out.println(c1);

        String str = new String("MM");
        System.out.println(str);

        Date date = new Date(2312312321312L);
        System.out.println(date);
    }
}
