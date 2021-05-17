package com.dragontalker.java;

/*
JDK 8之前日期和时间的API测试
 */

import org.junit.Test;

import java.util.Date;

public class DateTimeTest {

    //1. System类中的currentTimeMillis()
    @Test
    public void test1() {
        long time = System.currentTimeMillis();
        //返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差
        //称为时间戳
        System.out.println(time);
    }

    /*
    java.util.Date类
        |---java.sql.Date类

    1. 两个构造器的使用

    2. 两个方法的使用
        > toString()
     */
    @Test
    public void test2() {
        //构造器一: Date()
        Date date1 = new Date();
        System.out.println(date1.toString());
    }
}
