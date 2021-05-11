package com.dragontalker.java2;

/*
main()方法的使用说明:
    1. 作为程序的入口出现
    2. main()也是一个普通的静态方法
 */

public class MainTest {
    public static void main(String[] args) {

    }
}

class Main {
    public static void main(String[] args) {
        args = new String[100];
        for (int i = 0; i < args.length; i++) {
            args[i] = "args_" + i;
            System.out.println();
        }
    }
}
