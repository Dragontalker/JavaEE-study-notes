package com.dragontalker;

public class DoWhileTest {

    public static void main(String[] args) {

        // 遍历100以内的偶数，并计算所有的偶数的和以及偶数的个数
        int num = 1;
        int sum = 0;
        int count = 0;

        do {
            if (num % 2 == 0) {
                System.out.println(num);
                sum += num;
                count++;
            }

            num++;
        } while (num <= 100);

        System.out.println("总和为: " + sum);
        System.out.println("个数为: " + count);
    }
}
