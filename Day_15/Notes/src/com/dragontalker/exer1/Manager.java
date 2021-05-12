package com.dragontalker.exer1;

public class Manager extends Employee{

    private double bonus;

    @Override
    public void work() {
        System.out.println("管理员工, 提高公司运行的效率");
    }
}
