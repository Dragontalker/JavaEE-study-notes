package com.dragontalker;

/*
面向对象的特征之二: 继承性 Why?

一、继承性的好处:
    1. 减少了代码的重复性, 提高了代码的复用性
    2. 便于功能的扩展
    3. 为之后多态性的使用, 提供了前提

二、继承性的格式: class A extends B {}
    A: 子类、派生类、subclass
    B: 父类、超类、基类、superclass

    体现: 一旦子类A继承父类B以后, 子类A中就获取了父类B中声明的结构、属性、方法
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
