package com.dragontalker.exer5;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {
        // 1. 实例化Scanner, 用于从键盘获取学生成绩
        Scanner scan = new Scanner(System.in);
        int maxScore = 0;

        // 2. 创建Vector对象: Vector v = new Vector(); 相当于数组
        Vector v = new Vector();

        // 3. 通过for(;;)或while(true)方式, 给Vector添加数组
        while (true) {
            System.out.println("请输入学生成绩(以负数代表输入结束)");
            int score = scan.nextInt();

            if (score < 0) {
                break;
            }

            if (score > 100) {
                System.out.println("输入的数据非法, 请重新输入");
                continue;
            }

            // 3.1 添加操作, v.addElement(Object obj)
            v.addElement(score);

            // 4. 获取学生成绩的最大值
            if (maxScore < score) {
                maxScore = score;
            }
        }

        // 5. 遍历Vector, 得到每个学生的成绩, 并与最大成绩比较, 得到每个学生的成绩
        char level;
        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);
            int score = (int)obj;

            if (maxScore - score <= 10) {
                level = 'A';
            } else if (maxScore - score <= 20) {
                level = 'B';
            } else if (maxScore - score <= 30) {
                level = 'C';
            } else {
                level= 'D';
            }

            System.out.println("student-" + i + " score is " + score + ", level " + level);
        }
    }
}
