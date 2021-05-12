package com.dragontalker.interview;

interface A {
    int x = 0;
}

class B {
    int x = 1;
}

class C extends B implements A {
    public void pX() {
        //System.out.println(x); Error: ambiguous definition of x
        System.out.println(super.x); //1
        System.out.println(A.x); //0 记住接口中的是全局常量 public static final
    }
    public static void main(String[] args) {
        new C().pX();
    }
}

public class InterviewTest1 {
}
