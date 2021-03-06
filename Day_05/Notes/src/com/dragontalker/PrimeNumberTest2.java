package com.dragontalker;

/*
100以内的所有质数输出.
质数: 素数，只能被1和它本身整除的自然数.

Extra: 对原有算法的优化
 */

public class PrimeNumberTest2 {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int count = 0;
        label: for (int i = 2; i < 100000; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue label;
                }
            }
            count++;
        }

        long end = System.currentTimeMillis();

        System.out.println("质数的个数为: " + count);
        System.out.println("所花费的时间为: " + (end - start) + "毫秒");
    }
}

