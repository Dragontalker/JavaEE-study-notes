package com.dragontalker.java2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * 一、集合框架的概述
 *
 * 1. 集合、数组都是对多个数据进行存储操作的结构, 简称Java容器
 *  - 说明: 此时的存储, 主要指的是内存层面的存储, 不涉及到持久化的存储(.txt, .jpg, .avi, 数据库中)
 *
 * 2.1 数组在存储多个数据方面的特点:
 *  > 一旦初始化之后, 其长度就确定了
 *  > 数组一旦定义好, 其元素的类型也就确定了, 我们也就只能操作指定类型的数据了,
 *      - 比如: String[] arr1; int[] arr2; Object[] arr3;
 *
 * 2.2 数组在存储多个数据方面的缺点:
 *  > 一旦初始化之后, 长度不能修改
 *  > 数组中提供的方法非常有限, 对于添加、删除、插入数据等操作, 非常不便, 效率也不高
 *  > 获取数组中实际元素的个数的需求, 数组没有现成的属性或方法可用
 *  > 数组存储数据的特点: 有序、可重复. 对于无序、不可重复的需求, 不能满足
 *
 *
 * 二、结合框架
 *      |----Collection接口: 单列集合, 用来存储一个一个的对象
 *              |----list接口: 存储有序的、可重复的数据 ---> "动态"数组
 *                      |----ArrayList, LinkedList, Vector
 *              |----Set接口: 存储无序的、不可重复的数据 ---> 类似数学中的集合概念: 无序性、确定性、互异性
 *                      |----HashSet, LinkedHashSet, TreeSet
 *
 *      |----Map接口: 双列结合, 用来存储一对(key--value)一对的数据 ---> 类似数学的函数: y=f(x)
 *              |----HashMap, LinkedHashMap, TreeMap, HashTable, Properties
 *
 *
 * 三、Collection接口中的方法的使用
 */


public class CollectionTest {

    @Test
    public void test1() {
        Collection col = new ArrayList();

        //add(Object obj): 将元素obj添加到集合之中
        col.add("AA");
        col.add("BB");
        col.add("CC");
        col.add(123); //自动装箱
        col.add(new Date());

        //size(): 获取添加的元素的个数
        System.out.println(col.size());

        //addAll(Collection col): 将col集合中的元素添加到当前的集合中
        Collection col1 = new ArrayList();
        col1.add(456);
        col1.add("CC");
        col1.addAll(col);

        System.out.println(col1.size());
        System.out.println(col1);

        //clear(): 清空集合元素
        col1.clear();

        //isEmpty(): 判断当前集合是否为空
        System.out.println(col1.isEmpty()); //不会空指针, 只是清空了元素, 对象依然存在
    }
}
