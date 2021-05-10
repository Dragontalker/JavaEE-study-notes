package com.dragontalker.java;

public class PersonTest {
    public static void main(String[] args) {
        Person p2 = new Man();
        p2.eat();
        p2.walk();

        System.out.println(p2.id);
    }
}
