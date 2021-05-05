package com.dragontalker;

import java.util.Scanner;

public class ArrayExercise2 {

    public static void main(String[] args) {

        // 1. 使用Scanner, 读取学生个数.
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数: ");
        int number = scan.nextInt();

        // 2. 创建数组, 储存学生成绩, 动态初始化.
        int[] scores = new int[number];

        // 3. 给数组中的元素赋值.
        System.out.println("请输入" + number + "个学生成绩: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextInt();
        }

        // 4. 获取数组中的元素的最大值: 最高分.

        // 5. 根据每个学生成绩与最高分的差值, 得到每个学生的等级, 并输出等级和成绩.
    }
}
