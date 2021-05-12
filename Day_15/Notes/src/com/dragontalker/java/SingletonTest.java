package com.dragontalker.java;

public class SingletonTest {
    public static void main(String[] args) {

    }
}

class Bank {

    private Bank() {}

    public static Bank instance = new Bank();
}
