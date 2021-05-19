package com.dragontalker.java1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 1. 向TreeSet中添加的数据, 要求是先同类的对象.
 * 2. 两种排序方式: 自然排序(实现Comparable接口) 和 定制排序(Comparator接口)
 *
 * 3. 自然排序中, 比较两个对象是否相同的标准为: compareTo()返回值为0. 不再是equals()
 */

public class TreeSetTest {
    @Test
    public void test1() {
        TreeSet set = new TreeSet();

        //不能添加不同类的对象
        //set.add(123);
        //set.add(456);
        //set.add("AA"); 报错: ClassCastException
        //set.add(new User("Tom", 12));

        //举例一:
//        set.add(34);
//        set.add(-34);
//        set.add(37);
//        set.add(43);

        //举例二:
        set.add(new User("Tom", 12));
        set.add(new User("Jerry", 21));
        set.add(new User("Jack", 52));
        set.add(new User("Jack", 56));
        set.add(new User("Rose", 70));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        Comparator com = new Comparator() {
            //按照年龄从小到大排列
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                } else {
                    throw new RuntimeException("输入的类型不匹配");
                }
            }
        };

        TreeSet set = new TreeSet(com);
        set.add(new User("Tom", 12));
        set.add(new User("Jerry", 21));
        set.add(new User("Jack", 52));
        set.add(new User("Jack", 56));
        set.add(new User("Rose", 70));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
