package com.dragontalker;

public class OverloadExercise {
    public static void main(String[] args) {

    }

    // 1. 如下的三个方法构成重载
    public void mOL(int i) {
        System.out.println(i * i);
    }

    public void mOL(int i, int j) {
        System.out.println(i * j);
    }

    public void mOL(String s) {
        System.out.println(s);
    }

    // 2. 如下的三个方法构成重载
    public int max(int i, int j) {
        return (i > j) ? i : j;
    }

    public double max(double d1, double d2) {
        return (d1 > d2) ? d1: d2;
    }

    public double max(double d1, double d2, double d3) {
        double max = (d1 > d2) ? d1 : d2;
        return (max > d3) ? max : d3;
    }
}
