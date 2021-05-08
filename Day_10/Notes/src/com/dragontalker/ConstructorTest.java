package com.dragontalker;

/*
类的结构之三: 构造器(Constructor)

一、构造器的作用:
    1. 创建对象: new + 构造器
    2. 初始化对象的信息

二、说明:
    1. 如果没有显式的定义类的构造器的话, 则系统默认提供一个空参的构造器
    2. 定义构造器的格式: 权限修饰符 类名(形参列表)
    3. 一个类中定义的多个构造器, 可以构成重载
    4. 一旦我们显式的定义了类的构造器之后, 系统就不再提供默认的空参构造器
    5. 一个类中, 至少会有一个构造器.
 */

public class ConstructorTest {
    public static void main(String[] args) {
        Person p = new Person();

        Person p1 = new Person("Tom");
        System.out.println(p1.name);

        Person p2 = new Person("Jerry", 3);
        System.out.println(p2.name);
        System.out.println(p2.age);
    }
}

class Person {
    String name;
    int age;

    // 构造器
    public Person() {
        System.out.println("Person().....");
    }

    public Person(String str) {
        name = str;
    }

    public Person(String n, int a) {
        name = n;
        age = a;
    }
}
