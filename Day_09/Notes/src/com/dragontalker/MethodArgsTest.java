package com.dragontalker;

/*
可变个数形参的方法

1. jdk 5.0新增的内容
2. 具体使用:
    2.1 可变个数形参的格式: 数据类型 ... 变量名
    2.2 当调用可变个数形参的方法时, 传入的参数个数可以是: 0个, 1个, ....
 */

public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(12);
        test.show("Hello");
        test.show("Hello", "World");
    }

    public void show(int i) {
        System.out.println("Method 1 called.");
    }

    public void show(String s) {
        System.out.println("Method 2 called.");
    }

    public void show(String ... strs) {
        System.out.println("Method 3 called.");
    }
}
