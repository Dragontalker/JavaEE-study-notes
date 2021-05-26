package com.dragontalker.java;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void abstractMethod() {

    }

    @Override
    public void defaultMethod() {
        MyInterface.super.defaultMethod();
    }

    public static void main(String[] args) {
        //接口中的静态方法只能由接口自己调用
        MyInterface.staticMethod();

        //接口的实现类不能调用接口的静态方法
//        MyInterfaceImpl.staticMethod();
    }
}
