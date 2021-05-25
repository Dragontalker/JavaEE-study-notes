package com.dragontalker.java2;

import com.dragontalker.java1.Person;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * 调用运行时类中指定的结构: 属性、方法、构造器
 */

public class ReflectionTest {

    /*

     */
    @Test
    public void testFiled() throws Exception{
        Class<Person> clazz = Person.class;

        //获取指定的属性
        Field ids = clazz.getField("id");
    }
}
