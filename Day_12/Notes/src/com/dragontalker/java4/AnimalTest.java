package com.dragontalker.java4;

/*
多态性的使用举例一:
 */

public class AnimalTest {
}

class Animal {
    public void eat() {
        System.out.println("动物: 进食");
    }

    public void shout() {
        System.out.println("动物: 叫");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void shout() {
        System.out.println("汪！汪！汪！");
    }
}
