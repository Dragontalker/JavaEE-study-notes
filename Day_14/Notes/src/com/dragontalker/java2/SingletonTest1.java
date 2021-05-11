package com.dragontalker.java2;

/*
单例设计模式:
    1. 所谓单例设计模式, 就是采取一定的方法保证在整个的软件系统中, 对某个类只能存在一个对象实例

    2. 如何实现?
 */

public class SingletonTest1 {
    public static void main(String[] args) {

    }
}

class Bank {

    //1.私有化构造器
    private Bank() {}

    //2.内部创建类的对象
    private Bank instance = new Bank();

    //3.提供公共的方法, 返回类的对象
    public Bank getInstance() {
        return instance;
    }
}
