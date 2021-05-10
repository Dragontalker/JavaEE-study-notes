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
    }
}
