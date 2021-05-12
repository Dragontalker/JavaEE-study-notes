package com.dragontalker.exer2;

public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public Employee() {}

    public abstract double earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString() +
                '}';
    }
}
