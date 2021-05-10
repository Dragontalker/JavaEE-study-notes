package com.dragontalker.java1;

/*
面试题: == 和equals() 区别

一、回顾==的使用:
    - ==, 运算符
        1. 可以使用在基本数据类型变量和引用数据类型变量中
 */

public class EqualsTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i == j); //true
        System.out.println(i == d); //true 类型提升

        boolean b = true;
        //System.out.println(i == b); 布尔型不参与类型提升

        char c = 10;
        System.out.println(i == c); // true

        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2); // true
    }
}
