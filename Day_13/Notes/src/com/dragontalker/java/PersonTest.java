package com.dragontalker.java;

public class PersonTest {
    public static void main(String[] args) {
        Person p2 = new Man();
        p2.eat();
        p2.walk();

        System.out.println(p2.id); // 1001
        //p2.earnMoney(); 不能调用子类特有的方法, p2现在是Person类型
        //p2.isSmoking = true; 子类特有的属性也不能调用
        // 思考: 内存空间里是否加载过earnMoney()和isSmoking()？Yes, 但是被屏蔽了.

        // 有了对象的多态性以后, 内存中实际上是加载了子类特有的属性和方法的
        // 但是由于变量声明为父类类型, 编译时, 只能调用父类中声明的属性和方法
        // 子类特有的属性和方法不能调用

        // 如何才能调用子类特有的属性和方法？
        // 使用强制类型转换符 ---> 向下转型
        Man m1 = (Man) p2;

    }
}
