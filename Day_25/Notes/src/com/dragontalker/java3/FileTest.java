package com.dragontalker.java3;

import org.junit.Test;

import java.io.File;

/**
 * File类的使用
 *
 * 1. File类的一个对象, 代表一个文件或一个文件目录(俗称: 文件夹)
 * 2. File类声明在java.io包下
 */

public class FileTest {
    /*
    1. 如何创建File类的实例

    2.
        - 相对路径:
        - 绝对路径:
     */
    @Test
    public void test1() {
        File file = new File("hello.txt");
    }
}
