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
        new File(String filePath)
    2.
        - 相对路径: 相较于某个路径下, 指明的路径
        - 绝对路径: 包含盘符在内的文件或文件目录的路径
     */
    @Test
    public void test1() {
        File file1 = new File("hello.txt"); //相对于当前module
        File file2 = new File("C:\\Users\\richa\\Desktop\\GitHubRepos\\java-enterprise-edition\\Day_25\\Notes\\src\\com\\dragontalker\\java3\\world.txt");

        System.out.println(file1);
        System.out.println(file2);
    }
}
