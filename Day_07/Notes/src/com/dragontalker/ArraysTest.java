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

        // 2. Arrays.toString()
        System.out.println(Arrays.toString(arr1));

        // 3. Arrays.fill()
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));

        // 4. Arrays.sort()
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // 5. Arrays.binarySearch()
        int[] arr3 = new int[]{43, 32, 76, -98, 0, 64, 33, -21, 32, 99};
        int index = Arrays.binarySearch(arr3, 32);
        System.out.println(index);
    }
}
