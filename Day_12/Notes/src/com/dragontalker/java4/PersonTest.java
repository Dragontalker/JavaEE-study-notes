package com.dragontalker.java4;

/*
面向对象特征之三: 多态性

1. 理解多态性: 可以理解为一个事物的多种形态.
2. 何为多态性: 父类的引用指向子类的对象(或子类的对象赋给父类的引用)
 */

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.earnMoney();

        //*************
        // (对象的)多态性: 父类的引用指向子类的对象
        Person p2 = new Man();
        //Person p3 = new Woman();

        // 多态的使用:
        p2.eat();
        p2.walk();
    }
}
