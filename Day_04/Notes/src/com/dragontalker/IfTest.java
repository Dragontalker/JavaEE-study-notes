package com.dragontalker;

/*
说明：
1. else 结构是可选的。
2. 针对于条件表达式：
   > 如果多个条件表达式之间是“互斥”关系（或没有交集的关系）， 哪个判断和执行语句声明在上面还是下面，无所谓。
   > 如果多个条件表达式之间有交集关系，需要根据实际情况，考虑清楚应该将哪个结构声明在上面。
   > 如果多个条件表达式之间有包含的关系，通常情况下，需要将范围小的声明在范围大的上面。否则，范围小的就没机会。
*/

import java.util.Scanner;

public class IfTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入岳小鹏期末成绩： ");
        int score = scan.nextInt();

        if (score >= 100) {
            System.out.println("奖励一辆兰博基尼");
        } else if (score >= 80) {
            System.out.println("奖励一台iphone 12 Max");
        } else if (score >= 60) {
            System.out.println("奖励一个iPad");
        } else {
            System.out.println("什么奖励也没有");
        }
    }
}
