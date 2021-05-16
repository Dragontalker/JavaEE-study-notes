package com.dragontalker.java;

/*
涉及到String类与其他结构之间的转换
 */

import org.junit.Test;

public class StringTest1 {
    @Test
    public void test1() {
        //String ---> 基本数据类型、包装类: 调用包装类的静态方法: parseXxx(str)
        String str1 = "123";
        Integer int1 = Integer.parseInt(str1);
        System.out.println(str1);
        System.out.println(int1);


    }
}
