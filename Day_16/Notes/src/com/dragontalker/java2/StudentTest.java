package com.dragontalker.java2;

public class StudentTest {
}

class Student {
    int id;

    public void register(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("您输入的数据非法!");
        }
    }
}
