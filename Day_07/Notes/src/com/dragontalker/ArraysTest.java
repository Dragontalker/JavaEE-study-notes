package com.dragontalker;

/*
java.util.Arrays: 操作数组的工具类, 里面定义了很多操作数组的方法
 */

import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {

        // 1. Arrays.equals()
        int [] arr1 = new int[]{1, 2, 3, 4};
        int [] arr2 = new int[]{1, 3, 2, 4};
        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println(isEquals);
    }
}
