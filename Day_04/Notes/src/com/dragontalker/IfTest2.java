package com.dragontalker;

import java.util.Scanner;

public class IfTest2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个整数： ");
        int num1 = scanner.nextInt();

        System.out.println("请输入第二个整数：");
        int num2 = scanner.nextInt();

        System.out.println("请输入第三个整数：");
        int num3 = scanner.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("第一个整数最大！");
            } else {
                System.out.println("第三个整数最大！");
            }
        } else {
            if (num2 > num3) {
                System.out.println("第二个整数最大！");
            } else {
                System.out.println("第三个整数最大！");
            }
        }
    }
}
