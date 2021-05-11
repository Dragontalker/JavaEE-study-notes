package com.dragontalker.java3;

class Father {
    static {
        System.out.println("1111111111111111");
    }
    {
        System.out.println("2222222222222222");
    }

    public Father() {
        System.out.println("3333333333333333");
    }
}

public class Son {
}
