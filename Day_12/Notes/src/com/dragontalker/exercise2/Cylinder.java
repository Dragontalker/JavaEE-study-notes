package com.dragontalker.exercise2;

public class Cylinder extends Circle{

    private double length;

    public Cylinder() {
        this.length = 1.0;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    @Override
    public double findArea() {
        return Math.PI * getRadius() * getRadius() * 2 + 2 * Math.PI * getRadius() * getLength();
    }

    public double findVolume() {
        return Math.PI * getRadius() * getRadius() * getLength();
    }
}
