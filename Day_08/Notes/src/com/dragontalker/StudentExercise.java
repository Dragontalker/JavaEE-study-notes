package com.dragontalker;

public class StudentExercise {
    public static void main(String[] args) {

        Student[] students = new Student[20];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

    }
}

class Student {
    int number; // 学号
    int state; // 年级
    int score; // 成绩
}
