package com.dragontalker.java2;

/*
包装类的使用:

1. Java提供了8中基本数据类型对应的包装类, 使得基本数据类型的变量具有类的特征

2. 掌握的: 基本数据类型、 包装类、String三者之间的转换
 */

import org.junit.Test;

import java.net.InetSocketAddress;

public class WrapperTest {

    // String类型 ---> 基本数据类型、包装类: 调用包装类的parseXxx()
    @Test
    public void test5() {
        String str1 = "123";

        // 错误的情况:
        //int num1 = (int)str1;
        //Integer in1 = (Integer)str1; Integer和String没有子父类的关系

        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 1);

        String str2 = "true1";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
    }

    // 基本数据类型、包装类 ---> String类型: 调用String重载的valueOf(Xxx)
    @Test
    public void test4() {
        int num1 = 10;

        // 方式1: 连接运算
        String str1 = num1 + "";

        // 方式2: 调用String的valueOf(Xxx xxx)
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);
        System.out.println(str2);

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3);
    }

    /*
    JDK5.0新特性: 自动装箱与自动拆箱
     */

    @Test
    public void test3() {
        //int num1 = 10;

        // 基本数据类型 ---> 包装类的对象
        //method(num1);

        // 自动装箱: 基本数据类型 ---> 包装类的对象
        int num2 =10;
        Integer in1 = num2;

        boolean b1 = true;
        Boolean b2 = b1;

        // 自动拆箱: 包装类 ---> 基本数据类型
        System.out.println(in1.toString());

        int num3 = in1; // 自动拆箱

    }

    public void method(Object obj) {
        System.out.println(obj);
    }

    // 包装类 ---> 基本数据类型
    @Test
    public void test2() {
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);

        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
    }

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

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("true123");
        System.out.println(b3);

        Order order = new Order();
        System.out.println(order.isMale);
        System.out.println(order.isFemale);
    }
}

class Order {
    boolean isMale;
    Boolean isFemale;
}
