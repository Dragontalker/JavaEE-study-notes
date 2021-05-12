package com.dragontalker.java;

/*
抽象类的匿名子类
 */

public class PersonTest {
    public static void main(String[] args) {
        method(new Student());
    }

    public static void method(Student s) {}
}
