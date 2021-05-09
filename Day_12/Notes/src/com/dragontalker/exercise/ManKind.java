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

    public void setSalary(int salary) {
        if (salary < 0) {
            System.out.println("错误！Salary不能为负!");
        } else {
            this.salary = salary;
        }
    }

    public int getSalary() {
        return this.salary;
    }

    public void manOrWoman() {
        if (sex == 1) {
            System.out.println("man");
        } else {
            System.out.println("woman");
        }
    }

    public void employed() {
        String jobInfo = (salary > 0) ? "Employed!" : "Unemployed!";
        System.out.println(jobInfo);
    }
}
