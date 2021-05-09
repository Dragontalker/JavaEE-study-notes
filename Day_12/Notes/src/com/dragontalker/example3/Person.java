package com.dragontalker.example3;

public class Person {
    protected String name;
    protected int age;
    protected int id;

    public Person() {
        this.id = 1001;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("人: 吃饭");
    }

    public void walk() {
        System.out.println("人: 走路");
    }
}
