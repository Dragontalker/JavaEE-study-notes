package com.dragontalker.bank;

public class Account {
    private int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("余额不足, 取款失败!");
            return;
        }
        this.balance -= amount;
        System.out.println("成功取出￥" + amount);
    }

    public void deposit (double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("成功存入￥" + amount);
        }
    }
}
