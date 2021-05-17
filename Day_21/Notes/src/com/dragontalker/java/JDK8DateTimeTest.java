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
     */
    @Test
    public void test1() {
        LocalDate localeDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTIme = LocalDateTime.now();

        System.out.println(localeDate);
        System.out.println(localTime);
        System.out.println(localDateTIme);
    }
}
