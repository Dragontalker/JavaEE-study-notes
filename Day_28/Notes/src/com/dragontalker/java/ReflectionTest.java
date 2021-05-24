package com.dragontalker.java;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {
    //反射之前, 对于Person类的操作
    @Test
    public void test1() {
        //1. 创建Person类的对象
        Person p1 = new Person("Tom", 12);

        //2. 通过对象调用其内部的属性和方法
        p1.age = 10;
        System.out.println(p1);

        p1.show();

        //Person类外部, 不可以通过Person类的对象调用其私有的结构的
        //比如: name属性, showNation()方法, 已经私有的Person(String name)构造器
    }

    //反射之后, 对于Person类的操作
    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Person.class;
        Constructor cons = clazz.getConstructor(String.class, int.class);

        Object obj = cons.newInstance("Tom", 12);
        Person p = (Person) obj;
        System.out.println(p);
    }
}
