package com.dragontalker.java;

import org.junit.Test;

/**
 * 了解类的加载器
 */

public class ClassLoaderTest {
    @Test
    public void test1() {
        //对于自定义类, 使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);
        //调用系统类加载的getParent(): 获取扩展类加载器
        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1);
        //调用扩展类加载器的getParent(): 无法获取引导类加载器
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2); //Bootstrap引导器不能被直接获取到

        //引导类加载器主要负责加载Java的核心类库, 无法加载自定义类的
        ClassLoader classLoader3 = String.class.getClassLoader();
        System.out.println(classLoader3);
    }

    /*
    Properties: 用来读取配置文件
     */
    @Test
    public void test2() {

    }
}
