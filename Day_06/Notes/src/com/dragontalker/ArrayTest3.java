package com.dragontalker;

/*
二维数组的使用:

规定: 二维数组分为外层数组的元素，内层数组的元素
    int[][] arr = new int[4][3]；
    外层元素: arr[0], arr[1]等
    内层元素: arr[0][0], arr[1][2]等
 */

public class ArrayTest3 {

    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        System.out.println(arr[0]); // 内存地址 [I@e9e54c2
        System.out.println(arr[0][0]); // 0
        System.out.println(arr); // 内存地址 [[I@65ab7765
    }
}
