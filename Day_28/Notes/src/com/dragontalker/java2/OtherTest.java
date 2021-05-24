package com.dragontalker.java2;

import com.dragontalker.java1.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;

public class OtherTest {
    /*
    获取构造器结构
     */
    @Test
    public void test1() {
        Class<Person> clazz = Person.class;
        //getConstructor(): 获取当前运行时中声明为public的构造器
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c);
        }
        System.out.println();

        //getDeclaredConstructors(): 获取当前运行时类中声明的所有的构造器
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor c : declaredConstructors) {
            System.out.println(c);
        }
    }

    /*
    获取运行时类的父类
     */
    @Test
    public void test2() {
        Class<Person> clazz = Person.class;
        Class<? super Person> superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }

    /*
    获取运行时类带泛型的父类
     */
    @Test
    public void test3() {
        Class<Person> clazz = Person.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }
}
