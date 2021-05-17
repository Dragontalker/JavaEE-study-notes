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
        1. 像String、包装类等事项了Comparable接口: 重写了compareTo()方法
            - 给出了比较两个对象大小的方法
        2. 像String、包装类重写了compareTo()方法以后, 进行了从小到达的排列
        3. 重写compareTo()的规则:
            - 如果当前对象this大于形参对象obj, 则返回正整数
            - 如果当前对象this小于形参对象obj, 则返回负整数
            - 如果当前对象this等于形参对象obj, 则返回零
     */
    @Test
    public void test1() {
        String[] arr = new String[]{"AA", "CC", "MM", "GG", "JJ", "DD"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2() {
        Goods[] arr = new Goods[4];
        arr[0] = new Goods("LenovoMouse", 34);
        arr[1] = new Goods("DellMouse", 43);
        arr[2] = new Goods("XiaoMiMouse", 12);
        arr[3] = new Goods("HuaWeiMouse", 65);

        Arrays.sort(arr);
        System.out.println(arr.toString());
    }
}