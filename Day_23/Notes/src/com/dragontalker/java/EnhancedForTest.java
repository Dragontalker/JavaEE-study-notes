package com.dragontalker.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * jdk 5.0 新增了foreach循环, 用于遍历集合、数组
 */

public class EnhancedForTest {
    @Test
    public void test1() {
        Collection collection = new ArrayList();
        collection.add(new Person("Jerry", 20));
        collection.add(123);
        collection.add(456);
        collection.add(new String("Tom"));
        collection.add(false);

        //for(集合中元素的类型 局部变量 : 集合对象) {}
        //内部仍然调用了迭代器
        for(Object obj : collection) {
            System.out.println(obj);
        }
    }

    @Test
    public void test2() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};

        //for(数组中元素的类型 局部变量 : 数组对象) {}
        for(int i : arr) {
            System.out.println(i);
        }
    }

    //数组的练习题
    @Test
    public void test3() {
        String[] arr = new String[]{"MM", "MM", "MM"};

        //方式一: 普通for赋值
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "GG";
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
