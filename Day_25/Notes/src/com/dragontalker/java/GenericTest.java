package com.dragontalker.java;

import org.junit.Test;

import java.util.ArrayList;

/**
 * 泛型的使用
 * 1. jdk5.0新增的特性
 */

public class GenericTest {

    //在集合中使用泛型之前的情况:
    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(96);
    }
}
