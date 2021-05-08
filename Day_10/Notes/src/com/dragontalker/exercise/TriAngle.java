package com.dragontalker.exercise;

/*
总结: 属性赋值的先后顺序
    1. 默认初始化值
    2. 显式初始化值
    3. 构造器中赋值
    4. 通过“对象.方法”或“对象.属性”的方式赋值
 */

public class TriAngle {
    private double base;
    private double height;

    public TriAngle() {}

    public TriAngle(double b, double h) {
        base = b;
        height = h;
    }

    public void setBase(double b) {
        base = b;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getHeight() {
        return height;
    }
}
