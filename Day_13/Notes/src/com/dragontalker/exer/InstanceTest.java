package com.dragontalker.exer;

public class InstanceTest {
}

class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: " + name + "\nage: " + age;
    }
}

class Student extends Person {
    protected String school = "pku";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age + "\nschool: " + school;
    }
}
