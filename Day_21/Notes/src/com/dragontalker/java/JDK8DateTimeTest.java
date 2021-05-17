package com.dragontalker.java;

/*
jdk 8中日期时间API的测试
 */

import org.junit.Test;

import java.util.Date;

public class JDK8DateTimeTest {

    @Test
    public void testDate() {
        Date date1 = new Date(2020, 9, 8);
        System.out.println(date1);
    }
}
