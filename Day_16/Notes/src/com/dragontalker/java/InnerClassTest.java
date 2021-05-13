package com.dragontalker.java;

public class InnerClassTest {

    public void method() {
        //局部变量
        int num = 10;

        class AA {
            public void show() {
                //这里num被自动识别为final
                System.out.println(num);
            }
        }
    }
}
