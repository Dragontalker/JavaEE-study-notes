package com.dragontalker.java1;

public class Person extends Creature<String> implements Comparable<String>, MyInterface{
    private String name;
    private int age;

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public void info() {
        System.out.println("我是一个人~~");
    }
}
