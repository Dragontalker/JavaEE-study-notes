package com.dragontalker;

/*
面向对象的特征之二: 继承性

一、继承性的好处:
    1. 减少了代码的重复性, 提高了代码的复用性
    2. 便于功能的扩展
    3. 为之后多态性的使用, 提供了前提
 */

public class ExtendsTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.age = 1;
        p1.eat();

        Student s1 = new Student();
        s1.eat();
        s1.sleep();
    }
}
