package com.dragontalker.java;

import org.junit.Test;

public class ReflectionTest {
    //反射之前, 对于Person类的操作
    @Test
    public void test1() {
        //1. 创建Person类的对象
        Person p1 = new Person("Tom", 12);

        //2. 通过对象调用其内部的属性和方法
        p1.age = 10;
        System.out.println(p1);
    }

}
