package com.dragontalker.java;

/*
String的使用
 */

import org.junit.Test;

public class StringTest {

    /*
    String: 字符串, 使用一对""引起来表示
        1. String声明为final的, 不可被继承
        2. String实现了Serializable接口: 表示字符串是支持序列化的
                 实现了Comparable接口: 表示String可以比较大小
        3. String内部定义了final char[] value用于存储字符串数据
        4. String: 代表不可变的字符序列, 简称: 不可变性
            - 体现:
                4.1 当对字符串重新赋值时, 需要重写指定内存区域赋值, 不能使用原有的value进行赋值
                4.2 当对现有的字符串进行连接操作时, 也需要重新指定, 不能使用原有的value
                4.3 当调用String的replace()方法修改字符或字符串时, 也必须重新制定内存区域赋值
        5. 通过字面量的方式(区别于new)给一个字符串赋值, 此时的字符串声明在字符串常量池当中
        6. 字符串常量池当中是不会存储相同内容的字符串的
     */

    @Test
    public void test1() {
        String s1 = "abc"; //字面量的定义方式, 不需要new, 只有String才可以这样
        String s2 = "abc";

        System.out.println(s1 == s2);

        s1 = "hello";
        System.out.println(s1 == s2);

        System.out.println(s1);
        System.out.println(s2);

        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);
        System.out.println(s2);

        String s4 = "abc";
        String s5 = s4.replace("a", "m");
        System.out.println(s4);
        System.out.println(s5);
    }


    /*
    String的实例化方式:
    方式一: 通过字面量定义的方式
    方式二: 通过new + 构造器的方式
     */
    @Test
    public void test2() {
        //方式一: 通过字面量定义的方式: 此时的s1和s2的数据javaEE声明在方法区的字符串常量池中
        String s1 = "javaEE";
        String s2 = "javaEE";

        //方式二: 通过new + 构造器的方式: 此时的s3和s4保存的地址值, 是数据在堆空间中开辟空间以后
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //false
        System.out.println(s1 == s4); //false
        System.out.println(s3 == s4); //false

        Person p1 = new Person("Tom", 12);
        Person p2 = new Person("Tom", 12);
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);
    }
}
