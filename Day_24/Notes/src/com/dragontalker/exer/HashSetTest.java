package com.dragontalker.exer;

import java.util.ArrayList;
import java.util.HashSet;
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
}
