package com.dragontalker.java;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Map: 双列数据, 存储key-value对的数据 --- 类似数学中的函数: y = f(X)
 *  |----HashMap: 作为Map的主要实现类(1.2之后才出现), 线程不安全的, 效率高: 可以存储null的key和value
 *          |----LinkedHashMap: (1.4之后才出现), 保证遍历map元素时, 可以按照添加的顺序实现遍历
 *              - 原因: 在原有的HashMap底层结构基础上, 添加了一对指针, 指向前一个和后一个元素.
 *              - 对于频繁的遍历操作, 此类执行效率高于HashMap.
*   |----TreeMap: 保证按照添加的key-value对进行排序, 实现排序遍历
 *  |----Hashtable: 作为Map的古老实现类, 线程安全, 效率低: 不能存储null的key和value
 *          |----Properties:
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
