package com.dragontalker;

/*
二维数组的使用
 */

public class ArrayTest2 {

    public static void main(String[] args) {

        // 1. 二维数组的声明和初始化
        int [] arr = new int[]{1, 2, 3}; // 一维数组

        // 静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};

        // 动态初始化1
        String[][] arr2 = new String[3][2];

        // 动态初始化2
        String[][] arr3 = new String[3][];

        // 错误的情况
        // String[][] arr4 = new String[][4];
        // String[4][3] arr5 = new String[][];
        // int[][] arr6 = new int[4][3]{{1, 2, 3}, {4, 5}, {6, 7, 8}};

        // 正确
        int[] arr4[] = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};
        int[] arr5[] = {{1, 2, 3}, {4, 5}, {6, 7, 8}}; // 类型推断

        // 2. 如何调用数组的指定位置的元素
        System.out.println(arr1[0][1]); // 2
        System.out.println(arr2[1][1]); // null
        // System.out.println(arr3[1][0]); // Error: null pointer exception
        arr3[1] = new String[4];
        System.out.println(arr3[1][0]); // null
    }
}
