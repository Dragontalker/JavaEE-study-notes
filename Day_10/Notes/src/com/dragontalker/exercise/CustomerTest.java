package com.dragontalker.exercise;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
        Account account = new Account(1000, 2000, 1.23);
        customer.setAccount(account);
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        System.out.println("Customer[" + customer.getLastName() + ", "
                + customer.getFirstName() + "] has an account: with ID: " +
                "Annual Interest Rate: " + customer.getAccount().getAnnualInterestRate() +
                "%");
    }
}
