package com.dragontalker.java;
/*
jdk 8之前的日期时间的API测试
1. System类中currentTimeMillis();
2. java.util.Date和子类java.sql.Date();
3. SimpleDateFormat
4. Calender
 */

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTest {
    /*
    SimpleDateFormat的使用: SimpleDateFormat对日期Date类的格式化和解析

    1. 两个操作:
        1.1 格式化: 日期 ---> 字符串
        1.2 解析: 格式化的逆过程, 字符串 ---> 日期

    2. SimpleDateFormat的实例化
     */

    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat: 使用默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化: 日期 ---> 字符串
        Date date = new Date();
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);

        //解析: 格式化的逆过程, 字符串 ---> 日期
        String str = "2021-05-17, 11:33 a.m.";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        //************
        //SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MMMM.dd GGG hh:mm aaa");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aaa");
        String format1 = sdf1.format(date);
        System.out.println(format1);

    }
}
