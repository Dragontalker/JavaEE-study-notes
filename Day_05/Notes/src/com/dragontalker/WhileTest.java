package com.dragontalker;

/*
While 循环的使用

算法: 有限性
*/

public class WhileTest {

    public static void main(String[] args) {

        // 遍历100以内所有的偶数
        int i = 1;
        while(i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        // 出了while循环以后， i为101
        System.out.println("i现在是: " + i);
    }
}
