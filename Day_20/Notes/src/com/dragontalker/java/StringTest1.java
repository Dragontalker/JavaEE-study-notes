package com.dragontalker.java;

/*
涉及到String类与其他结构之间的转换
 */

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest1 {
    @Test
    public void test1() {
        //String ---> 基本数据类型、包装类: 调用包装类的静态方法: parseXxx(str)
        String str1 = "123";
        Integer int1 = Integer.parseInt(str1);
        System.out.println(str1);
        System.out.println(int1);

        //基本数据类型、包装类 ---> String: 调用String重载的valueOf(xxx)
        String str2 = String.valueOf(int1);
        System.out.println(str2);
    }

    @Test
    public void test2() {
        //String ---> char型数组
        String str1 = "abc123";
        char[] charArray = str1.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }

        //char型数组 ---> String
        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o'};
        String str2 = new String(arr);
        System.out.println(str2);
    }

    //String和字节数组的转换
    //编码: 字符串 ---> 字节
    //解码: 字节 ---> 字符串
    @Test
    public void test3() {
        //String ---> byte[]: 调用String的getBytes()
        String str1 = "abc123中国";
        byte[] bytes = str1.getBytes(); //使用默认的utf-8进行转换
        System.out.println(Arrays.toString(bytes));

        try {
            byte[] bytes1 = str1.getBytes("gbk"); //使用gbk字符集进行编码
            System.out.println(Arrays.toString(bytes1));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
