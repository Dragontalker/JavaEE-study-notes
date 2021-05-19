package com.dragontalker.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合元素的遍历操作, 使用迭代器Iterator接口
 * 内部的方法: next()和 hasNext()
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

        Iterator iterator = collection.iterator();

        //方式一:
//        System.out.println(iterator.next()); //Person{name='Jerry', age=20}
//        System.out.println(iterator.next()); //123
//        System.out.println(iterator.next()); //456
//        System.out.println(iterator.next()); //"Tom"
//        System.out.println(iterator.next()); //false

        //报异常: NoSuchElementException
        //System.out.println(iterator.next());

        //方式二: 不推荐
//        for(int i = 0; i < collection.size(); i++) {
//            System.out.println(iterator.next());
//        }

        //方式三: 推荐
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}