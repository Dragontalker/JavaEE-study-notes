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
     */

    @Test
    public void test1() {
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0, 'm');
        System.out.println(sb1);
    }
}
