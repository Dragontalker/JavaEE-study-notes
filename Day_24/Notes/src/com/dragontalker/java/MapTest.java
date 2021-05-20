package com.dragontalker.java;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 一、Map的实现类的结构
 * Map: 双列数据, 存储key-value对的数据 --- 类似数学中的函数: y = f(X)
 *  |----HashMap: 作为Map的主要实现类(1.2之后才出现), 线程不安全的, 效率高: 可以存储null的key和value
 *          |----LinkedHashMap: (1.4之后才出现), 保证遍历map元素时, 可以按照添加的顺序实现遍历
 *              - 原因: 在原有的HashMap底层结构基础上, 添加了一对指针, 指向前一个和后一个元素.
 *              - 对于频繁的遍历操作, 此类执行效率高于HashMap.
*   |----TreeMap: 保证按照添加的key-value对进行排序, 实现排序遍历.
 *      - 此时考虑key的自然排序或定制排序
 *      - 底层使用的红黑树
 *  |----Hashtable: 作为Map的古老实现类, 线程安全, 效率低: 不能存储null的key和value
 *          |----Properties: 常用来处理配置文件, key和value都是String类型
 *
 *
 * HashMap的底层: 数组 + 链表 (jdk7.0及之前)
 *               数组 + 链表 + 红黑树 (jdk8.0之后)
 *
 * 面试题:
 * 1. HashMap的底层实现原理?
 * 2. HashMap 和 HashTable的异同?
 * 3. CurrentHashMap 与 Hashtable的异同? (暂时不讲)
 *  - 涉及到多线程访问map
 *  - 涉及到分段锁的技术
 *
 *
 * 二、Map结构的理解
 */

public class MapTest {
    @Test
    public void test1() {
        Map map = new HashMap();
        map.put(null, 123);

        //map = new Hashtable();
        //map.put(null, null); 报错, 健壮性低
    }

}
