package com.dragontalker.java;

/*
异常方处理的方式二: throws + 异常类型

1. "throws + 异常类型"写在方法的声明处, 指明此方法执行时, 可能会抛出的异常类型
    - 一旦当方法体执行时, 出现异常, 仍会在异常代码处生成一个异常类的对象, 此对象满足throws后异常类型时, 就会被抛出.

 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest2 {

    public static void main(String[] args) {
        try {
            method2();
        } catch (FileNotFoundException e) {
            System.out.println("File NOT FOUND!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        method3();
    }

    public static void method3() {
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method2() throws FileNotFoundException, IOException{
        method1();
    }

    public static void method1() throws FileNotFoundException, IOException {
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while(data != -1) {
            System.out.println((char)data);
            data = fis.read();
        }
        fis.close();
        System.out.println("哈哈哈！");
    }
}
