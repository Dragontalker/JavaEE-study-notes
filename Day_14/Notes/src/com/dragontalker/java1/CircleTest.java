package com.dragontalker.java1;

public class CircleTest {
}

class Circle {
    private double radius;
    private int id;

    // 创造圆的个数
    private static int total;
    private static int init = 1001;

    public double findArea() {
        return Math.PI * radius * radius;
    }
}
