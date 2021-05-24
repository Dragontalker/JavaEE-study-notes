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

        //getMethods(): 获取当前运行时类及其所有父类中声明为public权限的方法
        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }

        System.out.println("***");

        //getDeclaredMethods(): 获取当前运行时类中声明的所有方法(不包含父类中声明的)
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method m : declaredMethods) {
            System.out.println(m);
        }
    }

    /*
    @Xxx
    权限修饰符 返回值类型 方法名(参数类型1 形参名1, ...) throws XxxException{}
     */
    @Test
    public void test2() {

    }
}
