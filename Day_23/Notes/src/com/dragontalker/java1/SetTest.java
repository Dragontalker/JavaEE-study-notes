package com.dragontalker.java1;

import com.dragontalker.java.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set接口的框架:
 *
 * 1. HashSet: 作为Set接口的主要实现类, 线程不安全的, 可以储存null值
 *
 * 2. LinkedHashSet: 作为HashSet的子类, 遍历其内部数据时, 可以按照添加的顺序去遍历
 *
 * 3. TreeSet: 可以按照添加对象的指定属性, 进行排序
 *
 * *******
 *
 * 1. Set接口中没有额外定义的方法, 都是Collection中的方法
 */

public class SetTest {
    /*
    Set: 存储无序的, 不可重复的数据
     - 以HashSet为例说明:
    1. 无序性:
        - 不等于随机性.
        - 存储的数据在底层数组中并非按照数组索引的顺序添加.
        - 而是根据数据的哈希值来添加

    2. 不可重复性:
        - 保证添加的元素按照equals()判断时, 不能返回true.
        - 即: 相同的元素只能添加一个.
     */
    @Test
    public void test1() {
        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new User("Tom", 12));
        set.add(new User("Tom", 12));
        set.add(129);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        };
    }
}
