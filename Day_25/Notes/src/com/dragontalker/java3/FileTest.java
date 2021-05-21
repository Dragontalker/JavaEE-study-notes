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
        - new File(String filePath)
        - new File(String parentPath, String childPath)
        - new File(File file, String childPath)
    2.
        - 相对路径: 相较于某个路径下, 指明的路径
        - 绝对路径: 包含盘符在内的文件或文件目录的路径
     */
    @Test
    public void test1() {
        //构造器1:
        File file1 = new File("hello.txt"); //相对于当前module
        File file2 = new File("C:\\Users\\richa\\Desktop\\GitHubRepos\\java-enterprise-edition\\Day_25\\Notes\\src\\com\\dragontalker\\java3\\world.txt");

        System.out.println(file1); //不需要有这个文件, 现在只是内存层面的对象
        System.out.println(file2);

        //构造器2:
        File file3 = new File("C:\\\\Users\\\\richa\\\\Desktop\\\\GitHubRepos", "java-enterprise-edition\\Day_25\\Notes\\src\\com\\dragontalker\\java3");
        System.out.println(file3);

        //构造器3:
        File file4 = new File(file3, "hi.txt");
        System.out.println(file4);
    }

    /*
    File类的方法:
     */
    @Test
    public void test2() {
        File file1 = new File("hello.txt");
        File file2 = new File("C:\\Users\\richa\\Desktop\\GitHubRepos\\java-enterprise-edition\\Day_25\\Notes\\src\\com\\dragontalker\\java3\\world.txt");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());

        System.out.println("========");

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());
    }

    @Test
    public void test3() {
        //如下的方式只适用于文件目录
        File file = new File("C:\\Users\\richa\\Desktop\\GitHubRepos");
        String[] list = file.list();
        for(String s : list) {
            System.out.println(s);
        }

        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }
}
