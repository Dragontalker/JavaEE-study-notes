package com.dragontalker;

public class Main {

    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 12;
        // the sum should be int
        // this won't work: byte b2 = b1 + i1;
        int i2 = b1 + i1;
        System.out.println(i2);

        float f = b1 + i1;
        System.out.println(f);

    }
}
