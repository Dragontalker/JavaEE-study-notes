package com.dragontalker.java2;

import org.junit.Test;

/**
 * 1. 泛型在继承方面的体现
 *
 * 2. 通配符的使用
 */

public class GenericTest {
    /*
    1. 泛型在继承方面的体现
     */
    @Test
    public void test1() {
        Object obj = null;
        String str = null;
        obj = str;

        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;
    }
}
