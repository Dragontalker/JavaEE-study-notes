package com.dragontalker.java;

import org.junit.Test;

import java.util.Arrays;

/**
 * 一、说明: Java中的对象, 正常情况下, 只能进行比较: == 或 !=.
 *  - 不能使用 > 或 <, 但是在开发的场景中, 我们需要对多个对象进行排序
 *  - 言外之意, 就需要比较对象的大小
 *  - 如何实现？使用两个接口中的任何一个: Comparable 或 Comparator
 *
 *  二、Comparable接口的使用
 *
 */

public class CompareTest {
    /*
    Comparable接口的使用举例:
     */
    @Test
    public void test1() {
        String[] arr = new String[]{"AA", "CC", "MM", "GG", "JJ", "DD"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
