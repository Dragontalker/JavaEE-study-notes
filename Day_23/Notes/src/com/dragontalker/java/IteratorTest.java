package com.dragontalker.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合元素的遍历操作, 使用Iterator接口
 */

public class IteratorTest {
    @Test
    public void test1() {
        Collection collection = new ArrayList();
        collection.add(new Person("Jerry", 20));
        collection.add(123);
        collection.add(456);
        collection.add(new String("Tom"));
        collection.add(false);


    }
}
