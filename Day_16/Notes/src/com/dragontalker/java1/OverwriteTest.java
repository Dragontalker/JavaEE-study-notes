package com.dragontalker.java1;

/*
方法重写的规则之一:
    - 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 */

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverwriteTest {
    public static void main(String[] args) {
        OverwriteTest test = new OverwriteTest();
        test.display(new SubClass());
    }

    public void display(SuperClass s) {
        try {
            s.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class SuperClass {
    public void method() throws IOException {}
}

class SubClass extends SuperClass {
    public void method() throws FileNotFoundException {}
}
