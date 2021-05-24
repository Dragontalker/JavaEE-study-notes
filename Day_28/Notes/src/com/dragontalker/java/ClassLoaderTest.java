package com.dragontalker.java;

import org.junit.Test;

/**
 * 了解类的加载器
 */

public class ClassLoaderTest {
    @Test
    public void test1() {
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1);

        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2); //Bootstrap引导器不能被直接获取到
    }
}
