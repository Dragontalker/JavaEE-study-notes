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

    }
}
