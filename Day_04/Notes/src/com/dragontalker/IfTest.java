package com.dragontalker;

import java.util.Scanner;

public class IfTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入岳小鹏期末成绩： ");
        int score = scan.nextInt();

        if (score == 100) {
            System.out.println("奖励一辆兰博基尼");
        } else if (score >= 80 && score < 100) {
            System.out.println("奖励一台iphone 12 Max");
        } else if (score >= 60 && score < 80) {
            System.out.println("奖励一个iPad");
        } else {
            System.out.println("什么奖励也没有");
        }
    }
}
