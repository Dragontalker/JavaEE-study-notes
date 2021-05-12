package com.dragontalker.exer2;

public class HourlyEmployee extends Employee{
    private int wage; //每小时的工资
    private int hour; //月工作的小时数

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    @Override
    public double earnings() {
        return 0;
    }
}
