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
    }
}
