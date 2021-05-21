package com.dragontalker.java2;

import org.junit.Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
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

    /*
    2. 通配符的使用
        - 通配符: ?
        - G<A>和G<B>的共同父类是G<?>
     */

    @Test
    public void test3() {
        List<Object> list1 = null;
        List<String> list2 = null;

        List<?> list = null;

        list = list1;
        list = list2;

        //print(list1);
        //print(list2);

        //
        List<String> list3 = new ArrayList<>();
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");
        list = list3;

        //添加: 对于List<?>, 就不能向其内部添加数据
        //除了添加null之外, 因为不论任何类型的对象, 都可以赋值null
        //list.add("DD");
        //list.add("?");

        //获取(读取): 允许读取数据, 读取的数据类型为Object
        Object o = list.get(0);
        System.out.println(o);
    }

    public void print(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }


    /*
    3. 有限制条件的通配符的使用
        ? extends Person:
        ? super Person:
     */
    @Test
    public void test4() {
        List<? extends Person> list1 = null;
        List<? super Person> list2 = null;
    }
}
