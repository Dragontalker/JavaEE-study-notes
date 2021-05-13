package com.dragontalker.java;

/*
异常方处理的方式二: throws + 异常类型
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest2 {

    public void method2() throws FileNotFoundException, IOException{
        method1();
    }

    public void method1() throws FileNotFoundException, IOException {
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while(data != -1) {
            System.out.println((char)data);
            data = fis.read();
        }
        fis.close();
    }
}
