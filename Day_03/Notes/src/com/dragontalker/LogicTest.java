package com.dragontalker;

public class LogicTest {

    public static void main(String[] args) {

        // 区分& 与 &&
        boolean b1 = true;
        int num1 = 10;
        if(b1 & (num1++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }

        boolean b2 = false;
        int num2 = 10;
        if(b2 & (num2++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }
    }
}
