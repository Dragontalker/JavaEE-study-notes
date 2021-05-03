package com.dragontalker;

/*
分支结构之二: switch-case

1. 格式
switch(表达式) {
    case 常量1:
        执行语句1;
        // break;
    case 常量2:
        执行语句2;
        // break;

    ...

    default:
        执行语句n;
        // break;
}
*/

public class SwitchCaseTest {

    public static void main(String[] args) {

        int number = 2;
        switch(number) {
            case 0:
                System.out.println("zero");
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
            default:
                System.out.println("other");
        }
    }
}
