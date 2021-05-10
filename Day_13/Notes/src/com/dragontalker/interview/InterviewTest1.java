package com.dragontalker.interview;

public class InterviewTest1 {
    public static void main(String[] args) {
        Base1 base = new Sub1();
        base.add(1, 2, 3);
    }
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
