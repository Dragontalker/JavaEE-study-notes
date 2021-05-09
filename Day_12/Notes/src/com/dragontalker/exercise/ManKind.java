package com.dragontalker.exercise;

public class ManKind {
    private int sex;
    private int salary;

    public void setSex(int sex) {
        if (sex < 0 || sex > 1) {
            System.out.println("错误! Sex必须为0或者1!");
        } else {
            this.sex = sex;
        }
    }

    public int getSex() {
        return this.sex;
    }
}
