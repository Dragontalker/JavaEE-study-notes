package com.dragontalker.exer;

import org.junit.Test;

public class StringDemo {
    /*
    将一个字符串进行反装, 将字符串中指定部分进行反转.

    方式一: 转换为char[]
     */
    public  String reverse(String str, int startIndex, int endIndex) {
        if (str != null && str.length() != 0) {
            char[] arr = str.toCharArray();
            for (int x = startIndex, y = endIndex; x < y ;x++, y--) {
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        } else {
            return str;
        }
    }

    //方式二: 使用String的拼接操作
    public  String reverse1(String str, int startIndex, int endIndex) {
        return null;
    }

    @Test
    public void testReverse() {
        String str = "abcdefg";
        String reverse = reverse(str, 2, 5);
        System.out.println(reverse);
    }
}
