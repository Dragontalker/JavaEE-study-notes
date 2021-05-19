package com.dragontalker.java1;

import org.junit.Test;

import java.util.TreeSet;

/**
 *
 */

public class TreeSetTest {
    @Test
    public void test1() {
        TreeSet set = new TreeSet();

        set.add(123);
        set.add(456);
        //set.add("AA"); 报错: ClassCastException
        //set.add(new User("Tom", 12));
    }
}
