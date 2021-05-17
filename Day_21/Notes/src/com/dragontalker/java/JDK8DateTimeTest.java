package com.dragontalker.java;

/*
jdk 8中日期时间API的测试
 */

import org.junit.Test;

import java.time.*;
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
        2. 类似于Calendar, 但是加入了不可变性
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

        //getXxx(): 获取相关属性
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());

        //体现不可变性
        //withXxx(): 设置相关属性
        LocalDateTime localDateTIme1 = localDateTime.withDayOfMonth(22);
        System.out.println(localDateTime); //不可变性
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = localDateTime.withHour(4);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        //plusXxx()
        LocalDateTime localDateTime3 = localDateTime.plusMonths(3);
        System.out.println(localDateTime); //不可变性
        System.out.println(localDateTime3);

        //minusXxx()
        LocalDateTime localDateTime4 = localDateTime.minusDays(6);
        System.out.println(localDateTime);
        System.out.println(localDateTime4);
    }

    /*
    Instant的使用
     */
    @Test
    public void test2() {
        //now(): 获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant); //UTC Time: 2021-05-17T19:03:24.349888300Z

        //添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
    }
}
