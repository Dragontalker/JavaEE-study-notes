package com.dragontalker.java2;

/*
类的内部成员之五: 内部类
    1. Java中允许将一个类A声明在另一个类B中, 则类A就是内部类, 类B称为外部类
    2. 内部类的分类: 成员内部类 vs 局部内部类(方法内、代码块内)

    3. 成员内部类:
        - 一方面, 作为外部类的成员:
        - 另一方面, 作为一个类:
            > 类内可以定义属性、方法、构造器等
            > 可以被final修饰, 表示不能被继承, 言外之意, 不使用final就可以被继承
            > 可以被abstract修饰, 表示不能被实例化
 */

public class InnerClassTest {
}

class Person {
    String name;
    int age;

    public void eat() {
        System.out.println("人: 吃饭");
    }

    //静态成员内部类
    static class Dog {
        String name;
        int age;

        public void show() {
            System.out.println("卡拉是条狗");
        }
    }

    //成员内部类
    class Bird {
        String name;

        public Bird() {}

        public void sing() {
            System.out.println("我是一只小小鸟");
            eat();
        }
    }

    public void method() {
        //方法内的局部内部类
        class AA {}
    }

    {
        //代码块内的局部内部类
        class BB {}
    }

    public Person() {
        //构造器中的局部内部类
        class CC {}
    }
}
