package com.dragontalker;

public class BonusQuestion {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a, b); // 需要在method方法被调用后, 仅打印a=100, b=200,
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
