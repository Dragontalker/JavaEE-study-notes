package com.dragontalker.java;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
    public void test2() throws Exception {
        Class clazz = Person.class;
        //1. 通过反射, 创建Person类的对象
        Constructor cons = clazz.getConstructor(String.class, int.class);

        Object obj = cons.newInstance("Tom", 12);
        Person p = (Person) obj;
        System.out.println(p);

        //2. 通过反射, 调用对象指定的属性、方法
        //调用属性
        Field age = clazz.getDeclaredField("age");
        age.set(p, 10);
        System.out.println(p);

        //调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        //通过反射, 可以调用Person类的私有结构的, 比如: 私有的构造器, 方法, 属性
        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Object p1 = (Person) cons1.newInstance("Jerry");
        System.out.println(p1);
    }
}
