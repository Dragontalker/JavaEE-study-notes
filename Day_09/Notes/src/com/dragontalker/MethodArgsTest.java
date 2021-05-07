package com.dragontalker;

/*
可变个数形参的方法

1. jdk 5.0新增的内容
2. 具体使用:
    2.1 可变个数形参的格式: 数据类型 ... 变量名
    2.2 当调用可变个数形参的方法时, 传入的参数个数可以是: 0个, 1个, ....
    2.3 可变个数形参的方法与本类中方法名相同, 形参不同的方法之间构成重载
    2.4 可变个数形参的方法与本类方法名相同, 形参类型也相同的数组之间不构成重载, 换句话说, 二者不能共存
    2.5 可变个数形参在方法的形参中, 必须声明在末尾
 */

public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(12);
        test.show("Hello");
        test.show("Hello", "World");
    }

    public void show(int i) {
        System.out.println("Method 1 called.");
    }

    public void show(String s) {
        System.out.println("Method 2 called.");
    }

    public void show(String ... strs) {
        System.out.println("Method 3 called.");

        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    //public void show(String[] strs) {}

    // Error: the variable argument type String of the method
    // show must be the last parameter
    //public void show (String ... strs, int i) {}
}
