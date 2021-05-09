package com.dragontalker.example3;

public class Student extends Person{
    private String major;
    private int id;

    public Student() {
        this.id = 1002;
    }

    public Student(String major) {
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生: 多吃有营养的食物");
    }

    public void study() {
        System.out.println("学生: 学习知识");
    }

    public void show() {
        System.out.println("name = " + super.name + ", age = " + super.age);
        System.out.println("id from parent = " + super.id);
        System.out.println("id from child = " + this.id);
    }
}
