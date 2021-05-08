package com.dragontalker.exercise;

public class Person {
    private int age;
    private String name;

    public void Person(int a) {
        age = 18;
        name = "John Doe";
    }

    public void setAge(int a) {
        if (a < 0 || a > 130) {
            throw new RuntimeException("传入的数据非法！");
        }

        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    // 绝对不要这样写!!
    //public int doAge(int a) {
        //age = a;
        //return age;
    //}
}
