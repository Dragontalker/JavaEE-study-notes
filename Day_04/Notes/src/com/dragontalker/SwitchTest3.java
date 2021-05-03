package com.dragontalker;

import java.util.Scanner;

public class SwitchTest3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入年份");
        int year = scan.nextInt();

        System.out.println("请输入月份");
        int month = scan.nextInt();

        System.out.println("请输入日期");
        int day = scan.nextInt();

        int sumDays = 0;
        switch (month) {
            case 12:
                sumDays += 31;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 29 : 28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
        }
        System.out.println(year + "年" + month + "月" + day + "日是当年的第" + sumDays + "天");
    }
}
