package com.dragontalker.java;

/*
jdk 8中日期时间API的测试
 */

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
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
        - 类似于java.util.Date类
     */
    @Test
    public void test2() {
        //now(): 获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant); //UTC Time: 2021-05-17T19:03:24.349888300Z

        //添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        //获取对应的毫秒数
        long toEpochMilli = instant.toEpochMilli();
        System.out.println(toEpochMilli); //1621278495854

        //通过给定的毫秒数, 获取Instant实例 ---> Date(long millis)
        Instant instant1 = Instant.ofEpochMilli(1621278495854L);
        System.out.println(instant1);
    }

    /*
    DateTimeFormatter: 格式化或解析日期、时间
        - 类似于SimpleDateFormat
     */

    @Test
    public void test3() {
        //方式一: 预定义的标准格式
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化: 日期 ---> 字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = formatter.format(localDateTime);
        System.out.println(localDateTime);
        System.out.println(str1);

        //解析: 字符串 ---> 日期
        TemporalAccessor parse = formatter.parse("2021-05-17T15:45:16.7164804");
        System.out.println(parse);

        //方式二: 本地化相关的格式
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        //格式化
        String str2 = formatter1.format(LocalDate.now());
        System.out.println(str2);

        //重点: 方式三: 自定义的格式
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //格式化
        String str3 = formatter2.format(LocalDateTime.now());
        System.out.println(str3);

        //解析
        TemporalAccessor parse1 = formatter2.parse("2021-05-17 03:53:22");
        System.out.println(parse1);
    }
}
