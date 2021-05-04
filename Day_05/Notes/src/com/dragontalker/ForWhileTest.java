package com.dragontalker;

/*
题目:
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序.
*/

import java.util.Scanner;

public class ForWhileTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;

        while(true) {
            System.out.println("请输入一个整数: ");
            int number = scan.nextInt();

            if (number == 0) {
                System.out.println("程序结束");
                break;
            }

            if (number > 0) {
                positiveCount++;
                System.out.println("得到第" + positiveCount +  "个正数: " + number);
            } else {
                negativeCount++;
                System.out.println("得到第" + negativeCount +  "个负数: " + number);
            }

        }

    }
}
