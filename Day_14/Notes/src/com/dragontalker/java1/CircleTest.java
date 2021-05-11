package com.dragontalker.java1;

public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();

        Circle c3 = new Circle(3.4);

        System.out.println("c1的id: " + c1.getId());
        System.out.println("c2的id: " + c2.getId());
        System.out.println("c3的id: " + c3.getId());

        System.out.println("创建圆的个数为: " + Circle.getTotal());
    }
}

class Circle {
    private double radius;
    private int id; // 自动复制

    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
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

    public static int getTotal() {
        return total;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }
}
