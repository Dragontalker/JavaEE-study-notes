package com.dragontalker.exer;

public class Account {

    private int id;
    private String pwd = "000000";
    private double balance;

    private static double interestRate;
    private static double minMoney = 1.0;
    private static int init = 1001; //用于自动生成id使用的

    public Account() {
        id = init++;
    }

    public Account(String pwd, double balance) {
        this();
        this.pwd = pwd;
        this.balance = balance;
    }

    public String getPwd() {
        return pwd;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}
