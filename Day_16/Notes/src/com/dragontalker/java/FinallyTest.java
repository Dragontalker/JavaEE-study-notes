package com.dragontalker.java;

/*
try-catch-finally当中finally的使用

1. finally是可选的
2. finally中声明的是一定会被执行的代码. 即使catch中又出现异常了,
    - try中有return语句,
    - catch中有return语句.

3. 像数据库连接, 输入输出流, 网络编程Socket等资源
    - JVM是不能自动回收的
    - 我们需要手动的进行资源释放
    - 此时的资源释放, 就需要声明在finally中
 */

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest {

    public int method() {
        try {
            int[] arr = new int[10];
            //System.out.println(arr[10]);
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 2;
        } finally {
            System.out.println("我一定会被执行！");
            return 3;
        }
    }

    @Test
    public void test1() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            int[] arr = new int[10];
            System.out.println(arr[10]);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("我好帅啊~~~");
        }
        //System.out.println("我好帅啊！！！");
    }

    @Test
    public void test2() {
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");
            fis = new FileInputStream(file);

            int data = fis.read();
            while(data != -1) {
                System.out.println((char)data);
                data = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (NullPointerException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
