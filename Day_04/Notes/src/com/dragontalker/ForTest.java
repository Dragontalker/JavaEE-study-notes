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

        // 例题: 遍历100以内的偶数
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
