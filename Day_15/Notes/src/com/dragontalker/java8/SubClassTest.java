package com.dragontalker.java8;

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();

        //知识点1: 接口中定义的静态方法, 只能通过接口调用
        //s.method1();
        CompareA.method1();

        //知识点2: 通过实现类的对象, 可以调用接口中的默认方法
        s.method2();

        //知识点3: 如果子类(或实现类)继承的父类和实现的接口中声明了同名同参数的方法
        //那么子类在没有重写此方法的情况下, 默认调用的是父类中的同名同参数的方法
        //---> 类优先原则
        s.method3();
    }
}

class SubClass extends SuperClass implements CompareA {

    @Override
    public void method2() {
        System.out.println("SubClass: 上海");
    }
}
