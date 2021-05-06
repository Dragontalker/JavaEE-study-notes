package com.dragontalker;

/*
数组中的常见异常:
    1. 数组角标越界的异常: ArrayIndexOutOfBoundsException
    2. 空指针异常: NullPointerException
 */

public class ArrayExceptionTest {

    public static void main(String[] args) {

        // 1. 数组角标越界的异常: ArrayIndexOutOfBoundsException
        int[] arr = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
