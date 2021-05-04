package com.dragontalker;

/*
break和continue关键字的使用
break: switch-case和循环都可以使用， 结束当前循环
continue: 只能在循环结构中使用， 结束当次循环
 */

public class BreakContinueTest {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                //break; // output: 123
                continue; // output: 123567910
            }
            System.out.print(i);
        }
    }
}
