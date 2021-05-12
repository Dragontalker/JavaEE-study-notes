package com.dragontalker.java8;

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();

        //知识点1: 接口中定义的静态方法, 只能通过接口调用
        //s.method1();
        CompareA.method1();

        //知识点2: 通过实现类的对象, 可以调用接口中的默认方法
        s.method2();
        s.method3();
    }
}

class SubClass extends SuperClass implements CompareA {

    @Override
    public void method2() {
        System.out.println("SubClass: 上海");
    }
}
