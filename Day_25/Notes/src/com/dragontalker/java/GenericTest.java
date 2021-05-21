package com.dragontalker.java;

import org.junit.Test;

import java.util.ArrayList;

/**
 * 泛型的使用
 * 1. jdk5.0新增的特性
 */

public class GenericTest {

    //在集合中使用泛型之前的情况:
    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        //需求: 存放学生的成绩
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(96);
        //问题一: 类型不安全
        //list.add("Tom");

        for (Object score : list) {
            //问题二: 强转时, 有可能出现类型转换异常
            int studentScore = (int) score; //ClassCastException
            System.out.println(studentScore);
        }
    }
}
