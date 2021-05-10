package com.dragontalker.interview;

public class InterviewTest1 {
}

class Base1 {
    public void add(int a, int ... arr) {
        System.out.println("base1");
    }
}

class Sub1 extends Base1 {
    public void add(int a, int[] arr) {
        System.out.println("sub_1");
    }
}
