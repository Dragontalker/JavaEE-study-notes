package com.dragontalker.java2;

/*
单例模式的懒汉式实现:

 */

public class SingletonTest2 {
    public static void main(String[] args) {

    }
}

class Order {

    //1.私有化类的构造器
    private Order() {}

    //2.声明当前类的对象, 没有初始化
    private Order instance = null;
}
