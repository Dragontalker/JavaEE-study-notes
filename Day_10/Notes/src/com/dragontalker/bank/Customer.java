package com.dragontalker.bank;

import com.dragontalker.exercise.Account;

public class Customer {
    private String firstName;
    private String lastName;
    private com.dragontalker.exercise.Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public com.dragontalker.exercise.Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
