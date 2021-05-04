package com.dragontalker;

/*
100以内的所有质数输出.
质数: 素数，只能被1和它本身整除的自然数.

Extra: 对原有算法的优化
 */

public class PrimeNumberOptimize {

    public static void main(String[] args) {

        // 获取当前时间距离1970-01-01 00:00:00的毫秒数
        long start = System.currentTimeMillis();

        for (int i = 2; i < 100; i++) {

            boolean isFlag = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break; // 优化一: 只对本身非质数的自然数时有效的.
                }
            }

            if (isFlag) {
                System.out.println(i + "是一个质数");
            }
        }


        // 获取当前时间距离1970-01-01 00:00:00的毫秒数
        long end = System.currentTimeMillis();

        System.out.println("所花费的时间为: " + (end - start) + "毫秒");
    }
}

