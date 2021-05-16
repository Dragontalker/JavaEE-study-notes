package com.dragontalker.java;

/*
关于StringBuffer和StringBuilder的使用
 */

import org.junit.Test;

public class StringBufferBuilderTest {
    /*
    String, StringBuffer, StringBuilder三者的异同?
    String: 不可变的字符序列: 底层使用char[]存储
    StringBuffer: 可变的字符序列: 线程安全的, 效率偏低, 底层使用char[]存储
    StringBuilder: jdk5.0新增, 可变的字符序列: 线程不安全, 效率高, 底层使用char[]存储

    源码分析:
    String str = new String(); //char[] value = new char[0];
    String str1 = new String("abc"); //new char[]{'a', 'b', 'c'};

    StringBuffer sb1 = new StringBuffer(); //char[] value = new char[16]; 底层创建了一个长度是16的数组
    sb1.append('a'); // value[count] = 'a'; (count = 0)
    sb1.append('b'); // value[count] = 'b'; (count = 1)
     */

    @Test
    public void test1() {
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0, 'm');
        System.out.println(sb1);
    }
}
