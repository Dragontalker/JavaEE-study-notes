package com.dragontalker;

public class StudentExercise {
    public static void main(String[] args) {

        Student[] students = new Student[20];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
            students[i].score = (int)(Math.random() * (100 - 0 + 1) + 1);
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].number + ", " + students[i].state + ", " + students[i].score);
        }

    }
}

class Student {
    int number; // 学号
    int state; // 年级
    int score; // 成绩


}