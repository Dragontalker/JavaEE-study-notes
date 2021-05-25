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
        return null;
    }

    @Override
    public void eat(String food) {

    }
}

public class ProxyTest {
}
