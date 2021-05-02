package com.dragontalker;

public class BitTest {

    public static void main(String[] args) {

        int i = 21;
        System.out.println("i << 2 : " + (i << 2)); // 21 * 2 * 2 = 84
        System.out.println("i << 3 : " + (i << 3)); // 21 * 2 * 2 * 2 = 168
        System.out.println("i << 26 : " + (i << 26));
        System.out.println("i << 27 : " + (i << 27)); // becomes negative
    }
}
