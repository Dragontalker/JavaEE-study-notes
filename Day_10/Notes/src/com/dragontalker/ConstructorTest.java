package com.dragontalker;

/*
类的结构之三: 构造器(Constructor)

一、构造器的作用:
    - 创建对象: new + 构造器

二、说明:
    1. 如果没有显式的定义类的构造器的话, 则系统默认提供一个空参的构造器
    2. 定义构造器的格式: 权限修饰符 类名(形参列表)
 */

public class ConstructorTest {
    public static void main(String[] args) {
        Person p = new Person();
    }
}

class Person {
    String name;
    int age;

    // 构造器
    public Person() {
        System.out.println("Person().....");
    }
}
