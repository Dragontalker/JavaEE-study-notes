package com.dragontalker.java2;

/*
main()方法的使用说明:
    1. 作为程序的入口出现
    2. main()也是一个普通的静态方法
    3. main()也可以作为与控制台交互的方式 (之前: 使用Scanner)
 */

public class MainTest {
    public static void main(String[] args) {
        Main.main(new String[100]);
    }
}

class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            args[i] = "args_" + i;
            System.out.println(args[i]);
        }
    }
}
