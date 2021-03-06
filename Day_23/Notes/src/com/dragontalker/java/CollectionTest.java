package com.dragontalker.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Collection接口中声明的方法的测试
 *
 * 结论:
 * 向Collection接口的实现类的对象中添加数据obj时, 要求obj的所在类要重写equals()方法
 *
 */

public class CollectionTest {
    @Test
    public void test1() {
        Collection collection = new ArrayList();
        collection.add(new Person("Jerry", 20));
        collection.add(123);
        collection.add(456);
        collection.add(new String("Tom"));
        collection.add(false);

        //Person p = new Person("Jerry", 20);
        //collection.add(p);


        //1. contains(Object obj): 判断当前集合中是否包含obj
        //我们在判断时会调用obj对象所在类的equals()
        boolean contains = collection.contains(123);
        System.out.println(contains);
        System.out.println(collection.contains(new String("Tom"))); //true
        //System.out.println(collection.contains(p)); //true
        System.out.println(collection.contains(new Person("Jerry", 20))); //false 没有重写equals()

        //2. containsAll(Collection collection): 判断形参collection中的所有元素是否都存在于当前的集合之中
        Collection collection1 = Arrays.asList(123, 456);
        System.out.println(collection.containsAll(collection1));
    }

    @Test
    public void test2() {
        //3. remove(Object obj): 从当前集合中移除obj元素
        Collection collection = new ArrayList();
        collection.add(new Person("Jerry", 20));
        collection.add(123);
        collection.add(456);
        collection.add(new String("Tom"));
        collection.add(false);

        System.out.println(collection.remove(123));
        System.out.println(collection);

        collection.remove(new Person("Jerry", 20)); //重写equals()之后才能移除

        //4. removeAll(Collection collection): 从当前集合中移除所有collection集合中的元素
        //类似数学中的差集 A \ B
        Collection collection1 = Arrays.asList(123, 4567);
        System.out.println(collection.removeAll(collection1)); //false 但是equals()返回true的元素还是被删除了
        System.out.println(collection);
    }

    @Test
    public void test3() {
        Collection collection = new ArrayList();
        collection.add(new Person("Jerry", 20));
        collection.add(123);
        collection.add(456);
        collection.add(new String("Tom"));
        collection.add(false);

        //5. retainAll(Collection collection): 获取当前集合和collection集合的交集
//        Collection collection1 = Arrays.asList(123, 456, 789);
//        System.out.println(collection1.retainAll(collection1));
//        System.out.println(collection1);

        //6. equals(Object obj): 要想返回true, 需要当前集合和形参中的集合中的元素相同
        Collection collection1 = new ArrayList();
        collection1.add(new Person("Jerry", 20));
        collection1.add(123);
        collection1.add(456);
        collection1.add(new String("Tom"));
        collection1.add(false);

        System.out.println(collection.equals(collection1)); //如果交换顺序就是false, 因为list是有序的
    }

    @Test
    public void test4() {
        Collection collection = new ArrayList();
        collection.add(new Person("Jerry", 20));
        collection.add(123);
        collection.add(456);
        collection.add(new String("Tom"));
        collection.add(false);

        //7. hashCode(): 返回当前对象的哈希值
        System.out.println(collection.hashCode());

        //8. 集合 ---> 转换为数组: toArray()
        Object[] arr = collection.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        //拓展: 数组 ---> 集合: 调用Arrays类的静态方法asList()
        List<String> list = Arrays.asList(new String[]{"AA", "BB", "CC", "DD"});
        System.out.println(list);

        List<int[]> list1 = Arrays.asList(new int[]{123, 456});
        System.out.println(list1);

        List list2 = Arrays.asList(new int[]{123, 456});
        System.out.println(list2.size()); //1

        List list3 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(list3.size()); //2 使用包装类的对象, asList()就会分别识别里面单个的元素

        //9. iterator(): 返回Iterator接口的实例, 用于遍历集合元素.
        //放在IteratorTest中
    }
}
