package com.dragontalker.java;

public class PersonTest {
    public static void main(String[] args) {
        Man p2 = new Man();
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
        Man m1 = (Man)p2;
        m1.earnMoney();
        m1.isSmoking = true;
        m1.eat();
        m1.walk();

        // 使用强转时, 可能出现ClassCastException的异常
        //Woman w1 = (Woman)p2; 子类之间无法转换

        /*
        instanceof关键字的使用:
            - x instanceof X: 判断对象x是否是类X的实例, return boolean
            - 使用情景:
                1. 为了避免在向下转型时出现ClassCastException的异常
                2. 我们在向下转型之前, 先进行instanceof的判断
                3. 一旦返回true, 就向下转型
                4. 如果返回false, 不进行向下转型
            - 如果 a instanceof A返回true, a instanceof B也返回true， 则B是A的父类

         */
        System.out.println(p2 instanceof Man);
        System.out.println(p2 instanceof Object);

        // 练习:
        // 问题一: 编译时通过, 运行时不通过
        // 举例一:
        //Person p3 = new Woman();
        //Man m3 = (Man)p3;

        // 举例二:
        //Person p4 = new Person();
        //Man m4 = (Man)p4;

        // 问题二: 编译时通过, 运行时不通过
        Object obj = new Woman();
        Person p = (Person)obj;

        // 问题三: 编译不通过
        //Man m5 = new Woman();
        //String str = new Data();
    }
}
