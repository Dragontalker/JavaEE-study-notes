package com.dragontalker;

/*
创建一个长度为6的int型数组, 要求数组元素的值在1-30之间, 且是随机赋值.
同时, 要求元素的值各不相同.
 */

public class ArrayTest {

    public static void main(String[] args) {
        int[] result = new int[6];
        int i = 0;
        while(i <= 5) {
            int number = (int)(Math.random() * 30 + 1);
            for (int j = 0; j < i; j++) {
                if (result[j] == number) {
                    continue;
                }
            }
            result[i] = number;
            i++;
        }
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        System.out.println(result[3]);
        System.out.println(result[4]);
        System.out.println(result[5]);

    }
}
