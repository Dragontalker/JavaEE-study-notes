package com.dragontalker.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * 练习: 在list内去除重复数字值, 要求尽量简单
 */

public class HashSetTest {
    public static List duplicateList(List list) {
        HashSet set = new HashSet();
        set.addAll(list);
        return new ArrayList(set);
    }

    @Test
    public void test1() {
        List list = new ArrayList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(2));
        list.add(new Integer(4));
        list.add(new Integer(4));

        List list2 = duplicateList(list);
        Iterator iterator = list2.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        HashSet set = new HashSet();
        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "BB");

        set.add(p1);
        set.add(p2);
        System.out.println(set);

        p1.name = "CC";
        set.remove(p1); //根据(1001, "CC")的hash值去找, 并没有定位到原有的位置, 所以没有remove
        System.out.println(set);

        set.add(new Person(1001, "CC"));
        System.out.println(set);

        set.add(p1); //可以加进去, hash值一样, 但是equals()返回不为0, 所以可以加进去
        set.add(p2); //不可以加进去
        System.out.println(set);
    }
}
