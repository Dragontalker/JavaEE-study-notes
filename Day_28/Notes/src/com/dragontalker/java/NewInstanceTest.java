package com.dragontalker.java;

import org.junit.Test;

/**
 * 通过反射创建对应的运行时类的对象
 */

public class NewInstanceTest {

    @Test
    public void test1() throws InstantiationException, IllegalAccessException {

        Class<Person> clazz = Person.class;
        /*
        newInstance(): 调用此方法, 创建对应的运行时类的对象
            内部调用了运行时类的空参构造器

        要想此方法正常的创建运行时类的对现象, 要求:
            1. 运行时类必须提供空参的构造器
            2. 空参的构造器的访问权限符合访问需求, 通常: 设置为public
         */
        Person obj = clazz.newInstance();
        System.out.println(obj);
    }
}
