package com.dragontalker.java;

/*
抽象类的匿名子类
 */

public class PersonTest {
    public static void main(String[] args) {
        method(new Student());

        Worker worker = new Worker();
        method1(worker); //非匿名的类非匿名的对象

        //创建了一个匿名类的对象: p, 右边可以看作一个匿名的子类
        Person p = new Person(){
            @Override
            public void eat() {}

            @Override
            public void breath() {}
        };
    }

    public static void method1(Person p) {
        p.eat();
        p.walk();
    }

    public static void method(Student s) {}
}

class Worker extends Person {

    @Override
    public void eat() {}

    @Override
    public void breath() {}
}
