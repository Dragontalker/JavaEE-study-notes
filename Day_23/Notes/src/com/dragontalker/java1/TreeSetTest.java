package com.dragontalker.java1;

import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 1. 向TreeSet中添加的数据, 要求是先同类的对象.
 */

public class TreeSetTest {
    @Test
    public void test1() {
        TreeSet set = new TreeSet();

        //不能添加不同类的对象
        //set.add(123);
        //set.add(456);
        //set.add("AA"); 报错: ClassCastException
        //set.add(new User("Tom", 12));

        //举例一:
//        set.add(34);
//        set.add(-34);
//        set.add(37);
//        set.add(43);

        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
