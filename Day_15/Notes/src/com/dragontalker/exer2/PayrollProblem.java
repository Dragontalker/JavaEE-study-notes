package com.dragontalker.exer2;

public class PayrollProblem {
    public static void main(String[] args) {
        Employee[] emps = new Employee[2];

        emps[0] = new SalariedEmployee("马森", 1002, new MyDate(1992, 2, 28), 10000);
        emps[1] = new HourlyEmployee("潘雨生", 2001, new MyDate(1991, 5, 6), 60, 240);
    }
}
