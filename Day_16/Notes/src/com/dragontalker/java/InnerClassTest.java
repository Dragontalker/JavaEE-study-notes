package com.dragontalker.java;

public class InnerClassTest {
    /*
    在局部内部类的方法中(比如: show) 如果调用局部内部类所声明的方法(比如:method)中的局部变量
    (num)要求此局部变量声明为final的
     */

    public void method() {
        //局部变量
        int num = 10;

        class AA {
            public void show() {
                //这里num被自动识别为final
                //final int num = 10;
                //所以, num = 20;就会报错
                //理解: 子结构不能更改父结构的参数
                System.out.println(num);
            }
        }
    }
}
