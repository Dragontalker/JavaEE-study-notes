package com.dragontalker;

/*
100以内的所有质数输出.
质数: 素数，只能被1和它本身整除的自然数.
 */

public class PrimeNumberTest {

    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {

            int factorCount = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    factorCount++;
                }
            }

            if (factorCount == 0) {
                System.out.println(i + "是一个质数");
            }
        }
    }
}
