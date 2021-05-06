package com.dragontalker;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 2;
        c1.calculateArea();
        System.out.println(c1.getArea());
    }
}

// 圆
class Circle {

    // 属性
    double radius;
    double area;

    // 求圆的面积
    public void calculateArea() {
        area =  Math.PI * radius * radius;
    }

    public double getArea() {
        return area;
    }

}
