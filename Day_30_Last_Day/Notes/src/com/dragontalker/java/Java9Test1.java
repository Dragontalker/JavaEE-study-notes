package com.dragontalker.java;

import org.junit.Test;

import java.lang.reflect.InaccessibleObjectException;
import java.util.*;

public class Java9Test1 {

    //java9新特性八: 集合工厂方法: 创建只读集合
    //Java8中的写法:
    @Test
    public void test1() {
        List<String> nameList = new ArrayList<>();
        nameList.add("Joe");
        nameList.add("Bob");
        nameList.add("Bill");
        System.out.println(nameList);
        nameList = Collections.unmodifiableList(nameList);
        //nameList.add("Tom"); 报异常: UnsupportedOperationException
        System.out.println(nameList);
    }

    @Test
    public void test3() {
        //此时得到的集合list也是一个只读集合
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        //list.add(6); 报异常: UnsupportedOperationException
    }

    //java9新特性八: 集合工厂方法: 创建只读集合
    @Test
    public void test4() {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        //list.add(6);
        System.out.println(list1);
    }
}
