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

public class ProxyTest {
}
