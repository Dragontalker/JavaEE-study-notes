package com.dragontalker;

/*
一、设计类, 其实就是设计类的成员

    属性 = 成员变量 = field = 域、字段
    方法 = 成员方法 = method = 函数
 */



public class PersonTest {

    public static void main(String[] args) {

    }

}

class Person {
    // 属性
    String name;
    int age;
    boolean isMale;

    // 方法
    public void eat() {
        System.out.println("人可以吃饭");
    }

    public void sleep() {
        System.out.println("人可以睡觉");
    }

    public void talk(String language) {
        System.out.println("人可以说话, 使用的是: " + language);
    }
}
