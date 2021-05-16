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

    StringBuffer sb2 = new StringBuffer("abc"); //char[] value = new char["abc".length() + 16]

    //问题1: System.out.println(sb2.length());
     - 底层返回的是count而不是value.length()

    //问题2: 扩容问题: 如果要添加的数据底层数据盛不下了, 那就需要扩容底层的数组
     - 底层会call一个叫ensureCapacityInternal()的方法
     - 牵扯到Arrays.copyOf()
     - 新的capacity是原有的2倍再加2, 如果还不满足就需要多少装多少

     指导意义: 开发中建议使用StringBuffer(int capacity)来自定义容量
     */

    @Test
    public void test1() {
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0, 'm');
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2.length()); //0
    }

    @Test
    public void test2() {
        StringBuffer s1 = new StringBuffer("abc");
        s1.append(1);
        s1.append('1');
        System.out.println(s1);

        //s1.delete(2, 4);
        s1.replace(2, 4, "hello");
        System.out.println(s1);

        s1.insert(2, false);
        System.out.println(s1);
        System.out.println(s1.length());

        s1.reverse();
        System.out.println(s1);

        String s2 = s1.substring(1, 6);
        System.out.println(s2);
    }
}
