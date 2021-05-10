package com.dragontalker.exer1;

public class GeometricObject {

    protected String color;
    protected double weight;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public GeometricObject(String color, double weight) {
        super();
        this.color = color;
        this.weight = weight;
    }

    public double findArea() {
        return 0.0;
    }
}
