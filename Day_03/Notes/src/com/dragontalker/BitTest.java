package com.dragontalker;

public class BitTest {

    public static void main(String[] args) {

        // 结论：
        // 1. 位运算符操作的都是整形的数据
        // 2. << : 在一定范围内， 每向左移1位，相当于 * 2
        //    >> : 在一定范围内， 每向右移1位， 相当于 / 2
        int i = 21;
        System.out.println("i << 2 : " + (i << 2)); // 21 * 2 * 2 = 84
        System.out.println("i << 3 : " + (i << 3)); // 21 * 2 * 2 * 2 = 168
        System.out.println("i << 26 : " + (i << 26));
        System.out.println("i << 27 : " + (i << 27)); // becomes negative
    }
}
