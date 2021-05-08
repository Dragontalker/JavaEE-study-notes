package com.dragontalker.exercise;

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        System.out.println("base: " + t1.getBase() + ", height: " + t1.getHeight());

        t1.setBase(2.0);
        t1.setHeight(2.4);
        System.out.println("base: " + t1.getBase() + ", height: " + t1.getHeight());
    }
}
