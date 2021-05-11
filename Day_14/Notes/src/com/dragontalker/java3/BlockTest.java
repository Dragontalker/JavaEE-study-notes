package com.dragontalker.java3;

/*
类的成员之四: 代码块(或初始块)

1. 代码快的作用: 用来初始化类、对象
2. 代码快如果有修饰的话, 只能使用static
3. 分类: 静态代码块 vs 非静态代码块

4. 静态代码块

5. 非静态代码块
    >内部可以有输出语句
 */

public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.decs;
    }
}

class Person {
    //属性
    String name;
    int age;
    static String decs = "我是一个人";

    //构造器
    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //静态代码块
    static {
        System.out.println("Hello! Static block!");
    }

    //非静态代码块
    {
        System.out.println("Hello! Non-static block!");
    }

    public static void info() {
        System.out.println("我是一个快乐的人!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


