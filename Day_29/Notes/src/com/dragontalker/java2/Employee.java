package com.dragontalker.java2;

public class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee() {
        System.out.println("Employee()...");
    }

    public Employee(int id) {
        System.out.println("Employee(int id)...");
        this.id = id;
    }

    public Employee(int id, String name) {
        System.out.println("Employee(int id, String name)....");
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
