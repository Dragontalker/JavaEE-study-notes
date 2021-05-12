package com.dragontalker.exer1;

public class EmployeeTest {
    public static void main(String[] args) {

        //多态
        Employee ceo = new Manager("乔布斯", 1000, 10000, 100000);
        Manager manager = new Manager("库克", 1001, 5000, 50000);

        ceo.work();
        manager.work();

        Employee worker1 = new CommonEmployee();

        worker1.work();
    }
}
