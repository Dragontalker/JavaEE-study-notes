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
    }
}
