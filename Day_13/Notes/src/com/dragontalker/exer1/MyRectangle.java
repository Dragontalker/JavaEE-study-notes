package com.dragontalker.exer1;

public class MyRectangle extends GeometricObject{

    private double width;
    private double height;

    public MyRectangle(double width, double height, String color, double weight) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }
}
