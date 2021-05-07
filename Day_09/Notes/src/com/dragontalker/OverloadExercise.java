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
}
