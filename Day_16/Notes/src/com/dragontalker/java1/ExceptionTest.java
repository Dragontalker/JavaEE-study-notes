package com.dragontalker.java1;

/*
一、异常的体系结构

java.lang.Throwable
    |---> java.lang.Error: 一般不编写针对性的代码处理
    |---> java.lang.Exception: 可以进行异常的处理
        |---> 编译时异常(checked)
            |---> IOException
                |---> FileNotFoundException
            |---> ClassNotFoundException
        |---> 运行时异常(unchecked)
            |---> NullPointerException
            |---> ArrayIndexOutOfBoundsException
            |---> ClassCastException
            |---> NumberFormatException
            |---> InputMismatchException
            |---> ArithmeticException

面试题: 常见的异常都有哪些？举例说明: 空指针、角标越界
 */

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

public class ExceptionTest {

    //*****************以下是运行时异常*****************
    //NullPointerException
    @Test
    public void test1() {
        int[] arr = new int[]{1,2, 3};
        arr = null;
        System.out.println(arr[3]);
    }

    //ArrayIndexOutOfBoundException
    @Test
    public void test2() {
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }

    //StringIndexOutOfBoundException
    @Test
    public void test3() {
        String str = "abc";
        System.out.println(str.charAt(3));
    }

    //ClassCastException
    @Test
    public void test4() {
        Object obj = new Date();
        String str = (String)obj;
    }

    //NumberFormatException
    @Test
    public void test5() {
        String str = "123abc";
        Integer.parseInt(str);
    }

    //InputMismatchException
    @Test
    public void test6() {
        //Scanner scanner = new Scanner(System.in);
        //int score  = scanner.nextInt();
        //System.out.println(score);
    }

    //ArithmeticException
    @Test
    public void test7() {
        int a = 10;
        int b = 0;
        System.out.println(a / b);

    }

    //*****************以下是编译时异常*****************
    @Test
    public void test8() {
//        File file = new File("hello.txt");
//        FileInputStream fis = new FileInputStream(file);
//
//        int data = fis.read();
//        while(data != -1) {
//            System.out.println((char)data);
//            data = fis.read();
//        }
//
//        fis.close();
    }
}
