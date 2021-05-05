package com.dragontalker;

/*
算法的考查: 数组的复制, 反转, 查找(线性查找, 二分法查找).
 */

public class SearchTest {

    public static void main(String[] args) {
        String[] arr = new String[]{"JJ", "DD", "MM", "BB", "GG", "AA"};

        // 数组的复制(区别于数组变量的赋值)
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        // 数组的反转
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        // 遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }

    }
}
