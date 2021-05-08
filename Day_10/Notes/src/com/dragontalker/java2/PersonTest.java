package com.dragontalker.java2;

/*
this关键字的使用:
    1. this可以用来修饰: 属性、方法、构造器
    2. this理解为: 当前对象

    - 在类的方法中, 我们可以使用“this.属性”或“this.方法”
    - 通常情况下, 我们都选择省略"this"
    - 特殊情况下, 如果方法的形参和类的属性同名时, 我们必须显式的使用"this.变量"的方式, 表明此变量是属性, 而不是形参

    3. this调用构造器
        - 我们在类的构造器中, 可以显式的使用"this(形参列表)"方式, 调用本类中的其他构造器
        - 构造器中不能通过"this(形参列表)"方式调用自己
        - 如果一个类中有n个构造器, 则最多有n-1个构造器中使用了"this(形参列表)"
        - 规定: "this(形参列表)"必须声明在当前构造器的首行
        - 构造器内部, 最多只能声明一个"this(形参列表)", 用来调用其他构造器
 */

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(12);
        p.setName("Tom");
        System.out.println(p.getAge());
        System.out.println(p.getName());
        p.eat();

        Person p1 = new Person("Tom");
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
        this.eat();
    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

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

    public void eat() {
        System.out.println("人吃饭");
        this.study();
    }

    public void study() {
        System.out.println("人学习");
    }
}
