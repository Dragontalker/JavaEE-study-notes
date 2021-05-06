package com.dragontalker;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 2;
        System.out.println(c1.findArea());
    }
}

// 圆
class Circle {

    // 属性
    double radius;

    // 求圆的面积
    public double findArea() {
        return Math.PI * radius * radius;
    }

}
