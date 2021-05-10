package com.dragontalker.exer1;

public class MyRectangle extends GeometricObject{

    private double width;
    private double height;

    public MyRectangle(double width, double height, String color, double weight) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double findArea() {
        return this.width * this.height;
    }
}
