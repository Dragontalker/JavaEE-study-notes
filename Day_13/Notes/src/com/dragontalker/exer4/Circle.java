package com.dragontalker.exer4;

public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
        super();
        this.weight = 1.0;
    }

    public Circle(String color, double weight) {
        super(color, weight);
    }

    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

}
