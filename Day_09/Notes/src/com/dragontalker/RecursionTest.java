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
        System.out.println(test.getProduct(5));
        System.out.println(test.getCustom(10));
        System.out.println(test.getFibonacci(4));
    }

    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }

    public int getProduct(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getProduct(n - 1);
        }
    }

    // 例3: 已知有一个数列: f(0)=1, f(1)=4, f(n+2)=2*f(n+1)+f(n),
    // 其中n是大于0的整数, 求f(10)的值.
    public int getCustom(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * getCustom(n - 1) + getCustom(n - 2);
        }
    }

    // 例4: Fibonacci
    public int getFibonacci(int n) {
        if (n < 3) {
            return 1;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
}
