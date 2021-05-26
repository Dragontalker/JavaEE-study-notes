package com.dragontalker.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;

public class Java9Test {

    //java9特性五: 钻石操作符的升级
    @Test
    public void test1() {
        //jdk8要求<>不能为空
        //钻石操作符与匿名内部类在java 8中不能共存, 在java9可以
        Comparator<Object> com = new Comparator<>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        //类型推断: jdk7开始就有了
        ArrayList<String> list = new ArrayList<>();
    }
}
