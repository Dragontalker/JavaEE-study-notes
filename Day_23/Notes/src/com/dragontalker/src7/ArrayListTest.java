package com.dragontalker.src7;

import com.dragontalker.java.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
    }
}
