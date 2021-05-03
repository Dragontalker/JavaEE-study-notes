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

2. 说明:
    a. 根据switch表达式中的值，依次匹配各个case中的常量。一旦匹配成功，则进入相应的case结构中，调用其执行语句。
        当调用完执行语句以后，则仍然继续向下执行，直到遇到break关键字。
*/

public class SwitchCaseTest {

    public static void main(String[] args) {

        int number = 2;
        switch(number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");
        }
    }
}
