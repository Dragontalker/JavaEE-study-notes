package com.dragontalker;

public class ForTest {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world!");
        }

        // exercise
        int num = 1;
        for(System.out.print('a'); num <= 3; System.out.print('c'), num++) {
            System.out.print('b');
        }

        // 例题: 遍历100以内的偶数， 输出所有偶数的和
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
                count++;
            }
        }
        System.out.println("总和为: " + sum);
        System.out.println("个数为: " + count);
    }
}
