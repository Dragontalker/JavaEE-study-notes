package com.dragontalker.java2;

/*
类的内部成员之五: 内部类
    1. Java中允许将一个类A声明在另一个类B中, 则类A就是内部类, 类B称为外部类
    2. 内部类的分类: 成员内部类 vs 局部内部类(方法内、代码块内)

    3. 成员内部类:
        - 一方面, 作为外部类的成员:
        - 另一方面, 作为一个类:
            > 类内可以定义属性、方法、构造器等
 */

public class InnerClassTest {
}

class Person {
    //静态成员内部类
    static class Dog {}

    //成员内部类
    class Bird {
        String name;

        public Bird() {}

        public void sing() {
            System.out.println("我是一只小小鸟");
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
