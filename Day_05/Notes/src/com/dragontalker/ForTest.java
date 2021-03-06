package com.dragontalker;

/*
题目: 输入两个正整数m和n，求其最大公约数和最小公倍数。
比如: 12和20的最大公约数是4， 最小公倍数是60。

说明: break关键字的使用
*/

import java.util.Scanner;

public class ForTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入第一个正整数: ");
        int m = scan.nextInt();

        System.out.println("请输入第二个正整数:");
        int n = scan.nextInt();

        // 获取两个数的较小值
        int min = (m > n) ? n : m;

        // 获取最大公约数
        for (int i = min; i > 0; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("最大公约数为 " + i);
                break;
            }
        }

        // 获取两个数的最小值
        int max = (m > n) ? m : n;

        // 获取最小公倍数
        for (int i = 1; i <= min; i++) {
            if ((i * max) % min == 0) {
                System.out.println("最小公倍数为 " + i * max);
                break;
            }
        }
    }
}
