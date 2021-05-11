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

public class Son extends Father{
    static {
        System.out.println("4444444444444444");
    }
    {
        System.out.println("5555555555555555");
    }

    public Son() {
        System.out.println("6666666666666666");
    }

    public static void main(String[] args) {
        System.out.println("7777777777777777");
        System.out.println("****************");

        new Son();
        System.out.println("****************");

        new Son();
        System.out.println("****************");

        new Father();

    }
}
