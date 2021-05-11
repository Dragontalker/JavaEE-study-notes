package com.dragontalker.java;

import org.junit.Test;

public class ReviewTest {

    @Test
    public void test1() {
        int[] arr = new int[]{1, 2, 3};
        print(arr);

        // 数组也是Object的子类
        System.out.println(arr.getClass().getSuperclass());
    }

    public void print(Object obj) {
        System.out.println(obj);
    }
}
