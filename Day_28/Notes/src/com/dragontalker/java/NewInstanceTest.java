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
         */
        Person obj = clazz.newInstance();
        System.out.println(obj);
    }
}
