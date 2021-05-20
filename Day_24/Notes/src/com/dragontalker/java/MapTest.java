package com.dragontalker.java;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Map: 双列数据, 存储key-value对的数据 --- 类似数学中的函数: y = f(X)
 *  |----HashMap: 作为Map的主要实现类(1.2之后才出现), 线程不安全的, 效率高: 可以存储null的key和value
 *          |----LinkedHashMap: (1.4之后才出现)
*   |----TreeMap:
 *  |----Hashtable: 作为Map的古老实现类, 线程安全, 效率低: 不能存储null的key和value
 *          |----Properties:
 */

public class MapTest {
    @Test
    public void test1() {
        Map map = new HashMap();

        map.put(null, 123);
    }

}
