package com.dragontalker.java;

import org.junit.Test;

import java.util.Comparator;

public class Java9Test {

    //java9特性五: 钻石操作符的升级
    @Test
    public void test1() {
        Comparator<Object> com = new Comparator<>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
    }
}
