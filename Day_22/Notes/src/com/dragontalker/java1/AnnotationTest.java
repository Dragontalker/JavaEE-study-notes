package com.dragontalker.java1;

/**
 * 注解的使用
 *
 * 1. 理解Annotation
 *  - jdk5.0新增
 *  - Annotation就是代码中标记的特殊信息
 *  - 代替XML配置
 *
 * 2. Annotation的使用实例
 *  示例一: 生成文档时的注解
 *  示例二: @Override @Deprecated @SuppressWarnings
 */

public class AnnotationTest {
    public static void main(String[] args) {
        Person p = new Student();
        p.walk();
    }
}

class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk() {
        System.out.println("人走路");
    }

    public void eat() {
        System.out.println("人吃饭");
    }
}

interface Info {
    void show();
}

class Student extends Person implements Info{
    @Override
    public void walk() {
        System.out.println("学生走路");
    }

    @Override
    public void show() {
        System.out.println("这是一个学生");
    }
}
