package com.dragontalker.java;

import org.junit.Test;

import java.util.*;

/**
 * Collections: 操作Collection、Map的工具类
 *
 * 面试题: Collection 和 Collections的区别?
 *  - Collection是接口
 *  - Collections是工具类
 */

public class CollectionsTest {

    @Test
    public void test1() {
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(56);
        list.add(458);
        list.add(750);
        list.add(124);

        System.out.println(list);

        //Collections.reverse()
        Collections.reverse(list);
        System.out.println(list);

        //Collections.shuffle()
        Collections.shuffle(list);
        System.out.println(list);

        //Collections.sort()
        Collections.sort(list);
        System.out.println(list);

        //Collections.swap(int index1, int index2)
        Collections.swap(list, 2, 4);
        System.out.println(list);
    }

    @Test
    public void test2() {
        //Collections.copy()
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(56);
        list.add(458);
        list.add(750);
        list.add(124);

        //报异常: IndexOutOfBoundsException
        //List dest = new ArrayList();
        //Collections.copy(dest, list);

        List dest = Arrays.asList(new Object[list.size()]);
        System.out.println(dest);

        Collections.copy(dest, list);
        System.out.println(list);
        System.out.println(dest);

        /*
        Collections类中提供了多个synchronizedXxx()方法
            - 该方法可使指定集合包装成线程同步的结合
            - 从而可以解决多线程并发访问集合时的线程安全问题
         */

    }
}
