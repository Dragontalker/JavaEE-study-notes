package com.dragontalker;

public class IfExercise {

    public static void main(String[] args) {

        // Exercise 1: What is the output? => atguigu
        int x = 4;
        int y = 1;
        if (x > 2) {
            if (y > 2)
                System.out.println(x + y);
            System.out.println("atguigu");
        } else
            System.out.println("x is " + x);

        // 课后练习4： 如何获取一个随机数： 10 - 99
        double value1 = Math.random(); // [0.0, 1.0)
        double value2 = Math.random() * 90; // [0.0, 90.0)
        double value3 = Math.random() * 90 + 10; // [10.0, 100.0)
        int value4 = (int)(Math.random() * 90 + 10); // [10, 99]

        // 公式: [a, b]: (int)(Math.random() * (b - a + 1) + a)
    }
}
