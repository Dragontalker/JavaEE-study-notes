package com.dragontalker.java;

/**
 * 动态代理的举例
 */

interface Human {

    String getBelief();
    void eat(String food);
}

//被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "I believe I can fly!";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}

/*
要想实现动态代理, 需要解决的问题?
 - 问题1: 如何根据加载到内存中的被代理类, 动态的创建一个代理类及其对象?
 - 问题2: 当通过代理类的对象调用方法时, 如何动态的去调用被代理类中的同名方法?
 */
public class ProxyTest {
}
