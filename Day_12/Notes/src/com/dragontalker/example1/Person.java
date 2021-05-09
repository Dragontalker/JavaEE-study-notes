package com.dragontalker.example1;

public class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void walk(int distance) {
        System.out.println("走了" + distance + "公里");
    }

    public double info1() {
        return 1.0;
    }
}
