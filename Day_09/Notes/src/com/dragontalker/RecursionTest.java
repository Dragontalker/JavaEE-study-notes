package com.dragontalker;

/*
递归方法的使用(了解)
    1. 递归方法: 一个方法内调用它自身.
    2. 方法递归包含了一种隐式的循环, 它会重复执行某段代码, 但这种重复执行无须循环控制.

递归一定要向已知方向递归, 否则这种递归就变成了无穷递归, 类似死循环.
 */

public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();
        System.out.println(test.getSum(5));
    }

    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }
}
