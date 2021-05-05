package com.dragontalker;

/*
练习1:
如何得到电话号码
 */

public class ArrayExercise1 {

    public static void main(String[] args) {

        int[] arr =new int[]{8, 2, 1, 0, 3};
        int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};
        String tel = "";
        for (int i = 0; i < index.length; i++) {
            tel += arr[index[i]];
        }
        System.out.println("联系方式: " + tel);
    }
}
