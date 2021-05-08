package com.dragontalker.java2;

/*
this关键字的使用:
    1. this可以用来修饰: 属性、方法、构造器
    2. this修饰
 */

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(12);
        p.setName("Tom");
        System.out.println(p.getAge());
        System.out.println(p.getName());
        p.eat();
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void eat() {
        System.out.println("人吃饭");
        this.study();
    }

    public void study() {
        System.out.println("人学习");
    }
}
