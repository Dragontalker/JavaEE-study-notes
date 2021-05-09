package com.dragontalker.example3;

/*
super关键字的使用:
    1. super理解为: 父类
    2. super可以用来调用: 属性、方法、构造器
    3. super的使用
        3.1 我们可以在子类的方法或构造器中, 通过使用"super.属性"或"super.方法"的方式, 显式的调用
        3.2 特殊情况: 当子类和父类中定义了同名的属性时, 我们要想在子类中调用父类中声明的属性, 则必须使用super
        3.3 特殊情况: 当子类重写了父类中的方法以后, 我们想在子类的方法中调用父类被重写的方法, 则必须使用super
 */

public class SuperTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();
        s1.study();
    }
}
