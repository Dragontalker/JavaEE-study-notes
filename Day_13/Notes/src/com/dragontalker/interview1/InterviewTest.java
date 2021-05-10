package com.dragontalker.interview1;

/*
关于包装类使用的面试题
 */

import org.junit.Test;

public class InterviewTest {

    @Test
    public void test1() {
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1);
    }

    @Test
    public void test2() {
        Object o2;
        if (true)
            o2 = new Integer(1);
        else
            o2 = new Double(2.0);
        System.out.println(o2);
    }
}
