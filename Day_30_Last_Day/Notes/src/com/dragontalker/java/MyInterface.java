package com.dragontalker.java;

public interface MyInterface {
    //如下的三个方法的权限修饰符都是public
    void abstractMethod();

    static void staticMethod() {
        System.out.println("我是接口中的静态方法");
    }

    default void defaultMethod() {
        System.out.println("我是接口中的默认方法");
    }


}

