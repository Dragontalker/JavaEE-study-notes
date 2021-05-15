package com.dragontalker.java;

/*
String的使用
 */

import org.junit.Test;

public class StringTest {

    /*
    String: 字符串, 使用一对""引起来表示
        1. String声明为final的, 不可被继承
        2. String实现了Serializable接口: 表示字符串是支持序列化的
                 实现了Comparable接口: 表示String可以比较大小
        3. String内部定义了final char[] value用于存储字符串数据
        4. String: 代表不可变的字符序列, 简称: 不可变性
     */

    @Test
    public void test1() {
        String s1 = "abc";
        String s2 = "abc";
        s1 = "hello";

        System.out.println(s1);
        System.out.println(s2);
    }
}
