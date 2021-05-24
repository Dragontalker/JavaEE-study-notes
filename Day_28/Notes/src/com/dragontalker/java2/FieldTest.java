package com.dragontalker.java2;

import com.dragontalker.java1.Person;
import org.junit.Test;
import java.lang.reflect.Field;

/**
 * 获取当前运行时类的属性结构
 */

public class FieldTest {
    @Test
    public void test1() {
        Class clazz = Person.class;

        //获取属性结构
        //getFields(): 获取当前运行时类及其父类中声明为public访问权限的属性
        Field[] fields = clazz.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }

    }
}
