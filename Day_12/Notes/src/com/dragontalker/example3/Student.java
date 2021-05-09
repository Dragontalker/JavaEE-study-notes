package com.dragontalker.example3;

public class Student extends Person{
    private String major;

    public Student() {}

    public Student(String major) {
        this.major = major;
    }

    public void eat() {
        System.out.println("学生: 多吃有营养的食物");
    }

    public void study() {
        System.out.println("学生: 学习知识");
    }
}
