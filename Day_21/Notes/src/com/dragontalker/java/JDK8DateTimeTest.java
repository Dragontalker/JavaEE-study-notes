package com.dragontalker.java;

/*
jdk 8中日期时间API的测试
 */

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class JDK8DateTimeTest {

    @Test
    public void testDate() {
        //偏移量
        //Date date1 = new Date(2020, 9, 8);
        Date date1 = new Date(2020 - 1900, 9 - 1, 8);
        System.out.println(date1); //Fri Oct 08 00:00:00 EDT 3920
    }

    /*
    LocalDate, LocalTime, LocalDateTime的使用

    说明:
        1. LocalDateTime相较于LocalDate、LocalTime, 使用频率要高
     */
    @Test
    public void test1() {
        //now(): 获取当前的日期、时间、日期+时间
        LocalDate localeDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localeDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //of(): 设置指定的年、月、时、分、喵, 没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 6, 13, 23, 43);
        System.out.println(localDateTime1);

        //getXxx()
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());

        //withXxxxx(): 体现不可变性
        LocalDateTime localDateTIme1 = localDateTime.withDayOfMonth(22);
        System.out.println(localDateTime); //不可变性
        System.out.println(localDateTime1);
    }
}
