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
        if (str != null && str.length() != 0){
            //第1部分
            String reverseStr = str.substring(0, startIndex);
            //第2部分
            for (int i = endIndex; i >= startIndex; i--) {
                reverseStr += str.charAt(i);
            }
            //第3部分
            reverseStr += str.substring(endIndex + 1);

            return reverseStr;
        } else {
            return str;
        }
    }

    //方式三: 使用StringBuffer/StringBuilder替换String
    public  String reverse2(String str, int startIndex, int endIndex) {
        if (str != null && str.length() != 0){
            StringBuilder builder = new StringBuilder(str.length());

            //第1部分:
            builder.append(str.substring(0, startIndex));
            //第2部分:
            for (int i = endIndex; i >= startIndex; i--) {
                builder.append(str.charAt(i));
            }
            //第3部分:
            builder.append(str.substring(endIndex + 1));
            return builder.toString();
        } else {
            return str;
        }
    }

    @Test
    public void testReverse() {
        String str = "abcdefg";
        String reverse = reverse(str, 2, 5);
        System.out.println(reverse);
    }

    @Test
    public void testReverse1() {
        String str = "abcdefg";
        String reverse = reverse1(str, 2, 5);
        System.out.println(reverse);
    }

    @Test
    public void testReverse2() {
        String str = "abcdefg";
        String reverse = reverse2(str, 2, 5);
        System.out.println(reverse);
    }
}
