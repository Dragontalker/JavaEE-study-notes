package com.dragontalker.exer2;

public class SalariedEmployee extends Employee{
    private int monthlySalary;

    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }
}
