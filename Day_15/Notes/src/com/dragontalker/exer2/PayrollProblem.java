package com.dragontalker.exer2;

import java.util.Scanner;

public class PayrollProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入当月的月份: ");
        int month = scanner.nextInt();

        Employee[] emps = new Employee[2];

        emps[0] = new SalariedEmployee("马森", 1002, new MyDate(1992, 2, 28), 10000);
        emps[1] = new HourlyEmployee("潘雨生", 2001, new MyDate(1991, 5, 6), 60, 240);

        for (Employee emp : emps) {
            System.out.println(emp);
            double salary = emp.earnings();

            if (month == emp.getBirthday().getMonth()){
                System.out.println("生日快乐！奖励￥100");
                salary += 100;
            }

            System.out.println("月工资为￥" + salary);
        }
    }
}
