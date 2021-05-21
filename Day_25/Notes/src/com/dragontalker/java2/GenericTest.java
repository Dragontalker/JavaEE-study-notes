package com.dragontalker.java2;

import org.junit.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * 1. 泛型在继承方面的体现
 *
 * 2. 通配符的使用
 */

public class GenericTest {
    /*
    1. 泛型在继承方面的体现
        - 类A是类B的父类
        - G<A>和G<B>二者不具备子父类关系
        - 二者是并列关系
        - 补充: 类A是类B的父类, A<G>是B<G>的父类
     */
    @Test
    public void test1() {
        Object obj = null;
        String str = null;
        obj = str;

        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;

        List<Object> list1 = null;
        List<String> list2 = new ArrayList<String>();
        //此时的list1和list2的类型不具有子父类的关系
        //编译不通过
        //list1 = list2;

        /*
        反证法: 假设list1 = list2
            list.add(123); 导致混入非String的数据, 出错, 违反了泛型的初衷
         */

        //show(list1);
        //show(list2);

    }

    //public void show(List<Object> list) {}

    @Test
    public void test2() {
        AbstractList<String> list1 = null;
        List<String> list2 = null;
        ArrayList<String> list3 = null;
        list1 = list3;
        list2 = list3;

        List<String> list4 = new ArrayList<>();
    }
}
