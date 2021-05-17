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
        > 构造器一: Date(): 创建了一个对应当前时间的Date对象
        > 构造器二: Date(long date): 创建指定好毫秒数的Date对象

    2. 两个方法的使用
        > toString(): 显示当前的年、月、日、时、分、秒
        > getTime(): 获取当前Date对象的毫秒数(时间戳)

    3. java.sql.Date对应的是数据库中的日期类型的变量
        > 如何实例化
     */
    @Test
    public void test2() {
        //构造器一: Date(): 创建了一个对应当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1); //Sun May 16 20:06:52 EDT 2021
        System.out.println(date1.getTime()); //1621210012282

        //构造器二: Date(long date): 创建指定好毫秒数的Date对象
        Date date2 = new Date(1621210012282L);
        System.out.println(date2);

        //创建了java.sql.Date对象
        java.sql.Date date3 = new java.sql.Date(1621210012282L);
        System.out.println(date3); //2021-05-16
        System.out.println(date3.getTime());
    }
}
