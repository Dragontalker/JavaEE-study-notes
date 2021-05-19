package com.dragontalker.java;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合元素的遍历操作, 使用迭代器Iterator接口
 * 1. 内部的方法: next()和 hasNext()
 * 2. 集合对象每次调用iterator()方法都得到一个全新的迭代器对象
 * 3. 默认Pointer都在集合的第一个元素之前
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
        //hasNext(): 判断是否还有下一个元素
        while(iterator.hasNext()) {
            //next(): 1. 指针下移 2. 讲下移位置上的元素放回
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        Collection collection = new ArrayList();
        collection.add(new Person("Jerry", 20));
        collection.add(123);
        collection.add(456);
        collection.add(new String("Tom"));
        collection.add(false);

        Iterator iterator = collection.iterator();

        //错误方法一: 判断的时候指针就会移动, 所以输出是跳着的
//        while((iterator.next()) != null) {
//            System.out.println(iterator.next());
//        }

        //错误方法二: 死循环, 不断的输出第一个元素, 因为指针每次都会创造新的迭代器, 指针都在开头
//        while(collection.iterator().hasNext()) {
//            System.out.println(collection.iterator().next());
//        }
    }

    //测试Iterator中的remove()
    @Test
    public void test3() {
        Collection collection = new ArrayList();
        collection.add(new Person("Jerry", 20));
        collection.add(123);
        collection.add(456);
        collection.add(new String("Tom"));
        collection.add(false);

        Iterator iterator = collection.iterator();

        while(iterator.hasNext()) {
            Object obj = iterator.next();
            if ("Tom".equals(obj)) {
                iterator.remove();
            }
        }

        Iterator iterator1 = collection.iterator();

        while(iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
