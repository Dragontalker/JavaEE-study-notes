package com.dragontalker.exercise2;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        cylinder.setRadius(2.1);
        cylinder.setLength(3.4);
        double volume = cylinder.findVolume();
        System.out.println("圆柱的体积为: " + volume);

        double area = cylinder.findArea();
        System.out.println("底面圆的面积为: " + area);
    }
}
