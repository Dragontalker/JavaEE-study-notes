package com.dragontalker.java3;

class Root {
    static {
        System.out.println("Root的静态初始化快");
    }
    {
        System.out.println("Root的普通初始化块");
    }

    public Root() {
        System.out.println("Root的无参数的构造器");
    }
}

public class LeafTest {
}
