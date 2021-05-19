package com.dragontalker.java;

/**
 * List接口: ArrayList, LinkedList, Vector
 *
 * 面试题: ArrayList, LinkedList, Vector三者的异同？
 * 同: 三个类都是实现了List接口, 存储数据的特点相同: 存储有序的, 可重复的数据
 * 不同:
 *  - ArrayList: 作为List接口的主要实现类, 执行效率高(线程不安全的),
 *      - 底层结构: 使用Object[]存储, 用elementData变量存储
 *  - LinkedList: 对于频繁的插入、删除操作, 使用此类效率比ArrayList高
 *      - 底层使用的双向链表存储
 *  - Vector: 作为List接口的古老实现类, 执行效率低(线程安全的)
 */

public class ListTest {
}
