package com.dragontalker.example1;

public class Student extends Person{
    private String major;

    public Student() {}

    public Student(String major) {
        this.major = major;
    }

    public void study() {
        System.out.println("学习");
    }
}
