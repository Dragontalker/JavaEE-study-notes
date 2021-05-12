package com.dragontalker.java;

/*
abstract关键字的使用
    1. abstract: 抽象的
    2. abstract可以用来修饰的结构、类、方法
    3. abstract修饰类: 抽象类
        > 此类不能实例化
 */

public class AbstractTest {
    public static void main(String[] args) {

        //一旦Person类抽象了, 就不可实例化
        //Person p1 = new Person();
        //p1.eat();
    }
}

abstract class Person {
    String name;
    int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("人吃饭");
    }

    public void walk() {
        System.out.println("人走路");
    }
}
