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
import java.util.Calendar;
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

        //************用指定的方式进行格式化: 调用带参的构造器************
        //SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MMMM.dd GGG hh:mm aaa");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aaa");
        //格式化
        String format1 = sdf1.format(date);
        System.out.println(format1); //2021-05-17 11:38:26 a.m.

        //解析: 要求字符串必须是符合SimpleDateFormat识别的格式(通过构造器参数实现)
        //否则, 就会抛异常
        Date date2 = sdf1.parse("2021-05-17 11:38:26 a.m.");
        System.out.println(date2);
    }

    /*
    练习一: 字符串"2020-09-08"转换为java.sql.Date

    练习二: "三天打鱼两天晒网" 1990-01-01 xxxx-xx-xx 打渔？晒网？

    举例: 2020-09-08 ? 需要计算总天数

    总天数 % 5 == 1, 2, 3: 打渔
    总天数 % 5 == 4, 0 晒网

    总天数的计算?
    方式一:
        1. date1.getTime() - 得到对应的毫秒数
        2. date2.getTime() - 得到对应的毫秒数
        3. date2.getTime() - date1.getTime() 得到差值
        4. / (1000 * 60 & 60 * 24) 除以每天的毫秒数
        5. + 1 考虑到余数

    方式二:
        1. 2019-12-31 - 1990-01-01 得到天数
        2. 2020-09-08 - 2020-01-01 得到天数
     */
    @Test
    public void testExercise() throws ParseException {
        String birth = "2020-09-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birth);
        //System.out.println(birth);

        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println(birthDate);
    }

    /*
    Calender(抽象类)日历类的使用
     */
    @Test
    public void testCalender() {
        //1. 实例化
        //方式一: 创建其子类(GeorgianCalender)的对象
        //方式二: 调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();
        //System.out.println(calender);

        //2. 常用方法
        //get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        //set()
        calendar.set(Calendar.DAY_OF_MONTH, 22);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //add()

        //getTime()

        //setTime()
    }
}
