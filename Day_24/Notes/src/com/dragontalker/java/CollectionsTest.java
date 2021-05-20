package com.dragontalker.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Collections: 操作Collection、Map的工具类
 *
 * 面试题: Collection 和 Collections的区别?
 *  - Collection是接口
 *  - Collections是工具类
 */

public class CollectionsTest {

    @Test
    public void test1() {
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(56);
        list.add(458);
        list.add(750);
        list.add(124);

        System.out.println(list);

        //Collections.reverse()
        Collections.reverse(list);
        System.out.println(list);

        //Collections.shuffle()
        Collections.shuffle(list);
        System.out.println(list);
    }
}
