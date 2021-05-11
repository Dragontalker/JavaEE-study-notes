package com.dragontalker.java1;

public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();
    }
}

class Circle {
    private double radius;
    private int id;

    public Circle() {
        id = init++;
    }

    // 创造圆的个数
    private static int total;
    private static int init = 1001;

    public double getRadius() {
        return radius;
    }

    public int getId() {
        return id;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }
}
