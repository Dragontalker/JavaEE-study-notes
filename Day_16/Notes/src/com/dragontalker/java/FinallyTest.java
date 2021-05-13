package com.dragontalker.java;

/*
try-catch-finally当中finally的使用

1. finally是可选的
2. finally中声明的是一定会被执行的代码. 即使catch中又出现异常了,
    - try中有return语句,
    - catch中有return语句.
 */

import org.junit.Test;

public class FinallyTest {

    @Test
    public void test1() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            int[] arr = new int[10];
            System.out.println(arr[10]);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("我好帅啊~~~");
        }
        //System.out.println("我好帅啊！！！");
    }
}
