package com.dragontalker;

/*
如何从键盘获取不同类型的变量：需要使用Scanner类

具体实现步骤：
1. 导包： import java.util.Scanner;
2. Scanner的实例化

*/

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的芳龄：");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重：");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("你是否单身？");
        boolean isSingle = scan.nextBoolean();
        System.out.println(isSingle);

        // 对于char型的获取，Scanner没有提供相关的方法，只能获取一个字符串
        System.out.println("请输入你的性别：（男、女）");
        String gender = scan.next(); // "男"
        char genderChar = gender.charAt(0);
        System.out.println(genderChar);
    }
}
