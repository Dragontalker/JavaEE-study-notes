package com.dragontalker.src7;

import com.dragontalker.java.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 1. 数组存储在 private transient Object[] elementData;
 * 2. 构造器里: this.elementDate = new Object[initialCapacity];
 * 3. 默认值: int initialCapacity = 10;
 * 4. 所以, ArrayList list = new ArrayList(); 创建了长度是10的数组elementData
 * 5. 如果添加导致底层的elementData数组容量不够, 则扩容
 * 6. 默认情况下, 扩容为原来容量的1.5倍, 同时需要将原有数组中的数据复制到新的数组中
 * 结论: 建议开发中使用带参的构造器public ArrayList(int initialCapacity)
 *  - 可以有效避免频繁扩容
 */

public class ArrayListTest {
    /**
     * 总结: 常用方法
     * 增: add(Object obj)
     * 删: remove(int index) / remove(Object obj)
     * 改: set(int index, Object ele)
     * 查: get(int index)
     * 插: add(int index, Object ele)
     * 长度: size()
     * 遍历: 1. Iterator()迭代器
     *      2. 增强for循环
     *      3. 普通的循环, 使用索引
     */

    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom", 12));
        list.add(456);

        System.out.println(list);

        //void add(int index, Object ele): 在index位置插入ele元素
        list.add(1, "BB");
        System.out.println(list);

        //boolean addAll(int index, Collection eles): 从index位置开始将eles中所有的元素添加进来
        List list1 = Arrays.asList(1, 2, 3);
        list.addAll(list1);
        System.out.println(list);
        System.out.println(list.size());

        //Object get(int index): 获取index位置的元素
        System.out.println(list.get(1));
    }

    @Test
    public void test2() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom", 12));
        list.add(456);

        //int indexOf(Object obj): 返回obj在集合中首次出现的位置, 如果不存在, 返回-1
        int index = list.indexOf(4567);
        System.out.println(index);

        //int LastIndexOf(Object obj): 返回obj在当前集合中最后出现的位置, 如果不存在, 返回-1
        int lastIndex = list.lastIndexOf(456);
        System.out.println(lastIndex);

        //int remove(int index): 移除指定index位置的元素, 并返回此元素
        Object obj = list.remove(0);
        System.out.println(obj);
        System.out.println(list);

        //Object set(int index, Object ele): 设置指定index位置的元素为ele
        list.set(1, "CC");
        System.out.println(list);

        //List subList(int fromIndex, int toIndex): 返回左闭右开区间的集合
        List subList = list.subList(2, 4);
        System.out.println(subList);
        System.out.println(list);
    }

    @Test
    public void test3() {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");

        //方式一: Iterator迭代器方式
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
