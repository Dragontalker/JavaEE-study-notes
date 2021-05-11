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

class Mid extends Root {
    static {
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通初始化快");
    }

    public Mid() {
        System.out.println("Mid的无参数的构造器");
    }

    public Mid(String msg) {
        //通过this调用同一类重载的构造器
        this();
        System.out.println("Mid的带参数的构造器, 其参数值" + msg);
    }
}

public class LeafTest {
}
