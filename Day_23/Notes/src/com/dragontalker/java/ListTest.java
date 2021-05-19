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
 *
 *
 * 2.1. ArrayList的源码分析: jdk7 的情况下, 见src7
 *
 * 2.2. jdk8下, ArrayList的变化:
 *  - ArrayList list = new ArrayList(); //底层Object[] elementData初始化为{}, 并没有创建长度为10的数组
 *  - 第一次调用add()时, 底层才创建了长度10的数组, 并将数据添加到elementData[0]
 *  ...
 *  - 后续的添加和扩容操作与jdk7无异
 *
 * 2.3. 小结:
 *  - jdk7中的ArrayList的对象的创建类似于单例模式的饿汉式
 *  - jdk8中的ArrayList的对象的创建类似于单例模式的懒汉式, 延时了数组的创建, 节省了内存
 *
 *
 * 3. LinkedList的源码分析
 *  LinkedList list = new LinkedList();
 */

public class ListTest {
}
