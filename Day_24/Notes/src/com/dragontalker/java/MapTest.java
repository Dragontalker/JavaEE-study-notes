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
 * 二、Map结构的理解：
 *  Map中的key: 无序的, 不可重复的, 使用Set存储所有的key
 *      ---> 要求key所在的类重写equals()和 hashCode() (以HashMap为例)
 *  Map中的value: 无序的, 可重复的, 使用Collection存储所有的value
 *      ---> value所在的类要重写equals()
 *  一个键值对: key-value构成一个Entry对象
 *  Map中的entry: 无序的, 不可重复的, 使用Set存储所有的entry
 *
 *
 * 三、HashMap的底层实现原理? 以jdk7为例说明:
 *  HashMap map = new HashMap();
 *  在实例化以后, 底层创建了长度为16的一维数组Entry[] table
 *  ...可能已经执行过多次put...
 *  map.put(key1, value1):
 *      - 首先, 调用key1所在类的hashCode()方法, 计算key1的哈希值,
 *      - 此哈希值经过某种算法之后, 得到在Entry数组中的存放位置
 *      - 如果此位置上的数据为空, 此时key1-value1添加成功 (情况1)
 *      - 如果此位置上的数据不为空(意味着此位置上存在一个或多个数据, 以链表的形式存在),
 *          - 比较key1和已经存在的数据的哈希值
 *          - 如果key1的哈希值与已经存在的数据的哈希值都不相同, 此时key1-value1添加成功 (情况2)
 *          - 如果key1的哈希值和已经存在的某一个数据(key2-value2)哈希值相同, 调用key1所在类的equals()继续比较
 *              - 如果equals()返回false: 此时key1-value1添加成功 (情况3)
 *              - 如果equals()返回true: 使用value1替换相同key的value2
 *
 *      补充: 关于情况2和情况3: 此时key1-value1和原来的数据以链表的方式存储
 *
 *      在不断的添加过程中, 会涉及到扩容问题,
 *          - 默认的扩容方式: 扩容为原来容量的2倍, 并将所有的数据复制过来
 *          - 超出threshold时, 且bucketIndex不为null时
 *
 *      jdk8相较于jdk7在底层实现方面的不同:
 *          1. new HashMap(): 底层没有创建一个长度为16的数组
 *          2. jdk8底层的数组是: Node[]而不是Entry[]
 *          3. 首次调用put()方法时, 底层创建长度为16的数组
 *          4. jdk7底层结构只有: 数组 + 链表
 *          5. jdk8底层结构: 数组 + 链表 + 红黑树
 *          6. 当数组的某一个索引位置上的元素以链表形式存在的数据个数 > 8, 且当前数组的长度 > 64时
 *              ---> 此时此索引位置上的所有数据改为使用红黑树存储
 *
 *
 *          DEFAULT_INITIAL_CAPACITY: HashMap的默认容量, 16
 *          DEFAULT_LOAD_FACTOR: HashMap的默认加载因子: 0.75
 *          threshold: 扩容的临界值 = 容量 * 填充因子 = 16 * 0.75 = 12
 *          TREEIFY_THRESHOLD: Bucket中链表长度长于该默认值, 转化为红黑树: 8
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
