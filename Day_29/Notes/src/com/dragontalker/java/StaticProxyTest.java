package com.dragontalker.java;

/**
 * 静态代理举例
 */

interface ClothFactory {
    void produceCloth();
}

//代理类
class ProxyClothFactory implements ClothFactory {

    private ClothFactory factory; //用被代理类对象进行实例化

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void produceCloth() {}
}

public class StaticProxyTest {
}
