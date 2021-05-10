package com.dragontalker.exer1;

public class Circle extends GeometricObject{

    private double radius;

    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }
}
