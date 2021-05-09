package com.dragontalker.example1;

/*
方法的重写(override/overwrite)
    1. 重写: 子类继承父类以后
 */

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.eat();
        s.walk(10);
        s.study();
    }
}
