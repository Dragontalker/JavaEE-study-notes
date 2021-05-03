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
        double value = Math.random(); // [0.0, 1.0]
    }
}
