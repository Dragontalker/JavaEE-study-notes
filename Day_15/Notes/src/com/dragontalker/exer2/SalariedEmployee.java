package com.dragontalker.exer2;

public class SalariedEmployee extends Employee{
    private int monthlySalary;



    @Override
    public double earnings() {
        return monthlySalary;
    }
}
