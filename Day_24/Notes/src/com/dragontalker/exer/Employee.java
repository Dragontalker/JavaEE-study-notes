package com.dragontalker.exer;

public class Employee {
    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {}

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
}
