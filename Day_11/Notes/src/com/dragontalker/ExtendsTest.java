package com.dragontalker;

public class ExtendsTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.age = 1;
        p1.eat();

        Student s1 = new Student();
        s1.eat();
        s1.sleep();
    }
}
