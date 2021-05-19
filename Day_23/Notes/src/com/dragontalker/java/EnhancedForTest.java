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
        for(Object obj : collection) {
            System.out.println(obj);
        }
    }
}
