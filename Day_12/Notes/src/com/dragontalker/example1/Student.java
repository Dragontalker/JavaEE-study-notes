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

    // 对父类中的eat方法进行重写
    public void eat() {
        System.out.println("学生应该多吃有营养的食物");
    }

    // Wrong return type from inheritence.
    //public int info1() {
        //return 1;
    //}

}
