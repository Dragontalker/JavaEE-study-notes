package com.dragontalker;

/*
100以内的所有质数输出.
质数: 素数，只能被1和它本身整除的自然数.
 */

public class PrimeNumberTest {

    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {

            boolean isFlag = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }

            if (isFlag) {
                System.out.println(i + "是一个质数");
            }
        }
    }
}
