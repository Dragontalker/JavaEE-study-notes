package com.dragontalker.exer;

public class StringDemo {
    /*
    将一个字符串进行反装, 将字符串中指定部分进行反转.

    方式一: 转换为char[]
     */
    public  String reverse(String str, int startIndex, int endIndex) {
        char[] arr = str.toCharArray();
        for (int x = startIndex, y = endIndex; x < y ;x++, y--) {
            char temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        return new String(arr);
    }
}
