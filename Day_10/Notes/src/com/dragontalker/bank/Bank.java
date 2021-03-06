package com.dragontalker.bank;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank(int reserve) {
        this.customers = new Customer[reserve];
    }

    public void addCustomer(String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName);
        customers[numberOfCustomers++] = customer;
    }

    public int getNumberOfCustomers() {
        return this.numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        }
        return null;
    }
}
