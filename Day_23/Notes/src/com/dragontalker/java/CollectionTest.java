package com.dragontalker.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection接口中声明的方法的测试
 */

public class CollectionTest {
    @Test
    public void test1() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new String("Tom"));
        collection.add(false);
        collection.add(new Person("Jerry", 20));

        //contains(Object obj): 判断当前集合中是否包含obj
        boolean contains = collection.contains(123);
        System.out.println(contains);
    }
}
