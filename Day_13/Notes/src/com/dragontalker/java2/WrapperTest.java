package com.dragontalker.java2;

/*
包装类的使用:

1. Java提供了8中基本数据类型对应的包装类, 使得基本数据类型的变量具有类的特征

2. 掌握的: 基本数据类型、 包装类、String三者之间的转换
 */

import org.junit.Test;

import java.net.InetSocketAddress;

public class WrapperTest {

    // 基本数据类型 ---> 包装类: 调用包装类的构造器
    @Test
    public void test1() {
        int num1 = 10;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());

        Integer in2 = new Integer("123");
        System.out.println(in2.toString());

        //Integer in3 = new Integer("123abc");
        //System.out.println(in3.toString());

        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1);
        System.out.println(f2);
    }

}
