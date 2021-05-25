package com.dragontalker.java;

/**
 * 静态代理举例
 */

interface ClothFactory {
    void produceCloth();
}

//代理类
class ProxyClothFactory implements ClothFactory {

    @Override
    public void produceCloth() {

    }
}

public class StaticProxyTest {
}
