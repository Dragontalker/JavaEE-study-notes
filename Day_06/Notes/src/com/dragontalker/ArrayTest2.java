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
    }
}
