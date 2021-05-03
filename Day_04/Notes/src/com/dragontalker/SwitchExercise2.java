package com.dragontalker;

import java.util.Scanner;

public class SwitchExercise2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生成绩");
        int score = scan.nextInt();

        int rank = score / 10;
        switch (rank) {
            case 10:
                System.out.println("等级: S");
                break;
            case 9:
                System.out.println("等级: A");
                break;
            case 7:
                System.out.println("等级: B");
                break;
            case 6:
                System.out.println("等级: C");
                break;
            default:
                System.out.println("等级: D");
        }
    }
}
