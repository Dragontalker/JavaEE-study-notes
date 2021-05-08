package com.dragontalker.exercise;

public class Person {
    private int age;

    public void setAge(int a) {
        if (a < 0 || a > 130) {
            throw new RuntimeException("传入的数据非法！");
        } else {
            age = a;
        }
    }
}
