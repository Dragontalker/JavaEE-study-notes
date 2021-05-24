package com.dragontalker.java2;

import com.dragontalker.java1.Person;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * 获取运行时类的方法结构
 */

public class MethodTest {
    @Test
    public void test1() {
        Class<Person> clazz = Person.class;

        //
        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
    }
}
