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




    }

    // 遍历Student[]的数组操作
    public void printStudentList(Student[] list) {
        for (Student student : list) {
            System.out.println(student.info());
        }
    }

    public void searchState(Student[] list, int state) {
        for (Student student : list) {
            if (student.state == state) {
                System.out.println(student.info());
            }
        }
    }

    public void bubbleSort(Student[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j].score > list[j + 1].score) {
                    Student temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

}

class Student {
    int number; // 学号
    int state; // 年级
    int score; // 成绩

    public String info() {
        return "学号: " + number + ", 年级: " + state + ", 成绩: " + score;
    }
}

