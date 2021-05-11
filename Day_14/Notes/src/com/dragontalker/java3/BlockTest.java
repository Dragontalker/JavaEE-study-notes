package com.dragontalker.java3;

/*
类的成员之四: 代码块(或初始块)
 */

public class BlockTest {
    public static void main(String[] args) {

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

    //代码块
    {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


