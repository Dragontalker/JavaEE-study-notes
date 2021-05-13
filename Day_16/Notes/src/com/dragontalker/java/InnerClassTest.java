package com.dragontalker.java;

import javax.swing.text.View;

public class InnerClassTest {

    //安卓开发的例子, view model, 类似React中的state不能被method改变
    public void onCreate() {
        int num = 10;
        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick() {
                System.out.println("Hello!");
                System.out.println(num);
            }
        };
        button.setOnClickListener(listener);
    }


    /*
    在局部内部类的方法中(比如: show) 如果调用局部内部类所声明的方法(比如:method)中的局部变量
    (num)要求此局部变量声明为final的

    JDK7及之前的版本: 要求此局部变量显式的声明为final的
    JDK8及之后的版本: 可以省略final的声明
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
                //final之后, 传入的实际上是一个num的副本, 而不是num本身
                System.out.println(num);
            }
        }
    }
}
