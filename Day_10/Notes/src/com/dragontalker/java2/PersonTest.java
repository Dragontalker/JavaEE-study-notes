package com.dragontalker.java2;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(12);
        p.setName("Tom");
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
