package com.dragontalker.exercise;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
        Account account = new Account(1000, 2000, 1.23);
        customer.setAccount(account);
    }
}
