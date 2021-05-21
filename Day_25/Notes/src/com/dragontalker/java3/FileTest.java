package com.dragontalker.java3;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

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

    /*
    public boolean renameTo(File dest): 把文件重命名为指定的文件路径
        - 比如: file1.renameTo(file2)为例:
            - 要想保证返回true, 需要file1在硬盘中是存在的, 且file2不能在硬盘中存在
     */
    @Test
    public void test4() {
        File file1 = new File("hello.txt");
        File file2 = new File("C:\\Users\\richa\\Desktop\\GitHubRepos\\java-enterprise-edition\\Day_25\\Notes\\src\\com\\dragontalker\\java3\\hello.txt");

        boolean renameTo = file2.renameTo(file1);
        System.out.println(renameTo);
    }

    /*
    更多的常用方法
        - isDirectory()
        - isFile()
        - exists()
        - canRead()
        - canWrite()
        - isHidden()
     */
    @Test
    public void test5() {
//        File file1 = new File("hello.ext");
//
//        System.out.println(file1.isDirectory());
//        System.out.println(file1.isFile());
//        System.out.println(file1.exists());
//        System.out.println(file1.canRead());
//        System.out.println(file1.canWrite());
//        System.out.println(file1.isHidden());

        File file2 = new File("C:\\Users");

        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.exists());
        System.out.println(file2.canRead());
        System.out.println(file2.canWrite());
        System.out.println(file2.isHidden());
    }

    /*
    创建硬盘中对应的文件或文件目录
        - createNewFile()
        - mkdir()
        - mkdirs()

    删除磁盘文件中的文件或文件目录
        - delete()
        - 注意事项: Java中的删除不走回收站
     */
    @Test
    public void test6() throws IOException {
        //文件的创建
        File file1 = new File("hi.txt");
        if (!file1.exists()) {
            file1.createNewFile();
            System.out.println("创建成功");
        } else {//文件存在
            file1.delete();
            System.out.println("删除成功");
        }
    }

    @Test
    public void test7() {
        //文件目录的创建
    }
}
