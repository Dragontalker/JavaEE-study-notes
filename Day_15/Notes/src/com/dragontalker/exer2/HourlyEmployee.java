package com.dragontalker.exer2;

public class HourlyEmployee extends Employee{

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    @Override
    public double earnings() {
        return 0;
    }
}
