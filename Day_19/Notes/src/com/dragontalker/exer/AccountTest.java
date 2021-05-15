package com.dragontalker.exer;

/*
银行有一个账户.
有两个储户分别向同一个账户存3000元, 每次存1000, 存3次, 每次存完打印账户余额.

分析:
1. 是否是多线程问题? 是, 两个储户线程
2. 是否有共享数据? 有, 账户(或账户余额)
3. 是否有线程安全问题? 有
4. 需要考虑如何解决线程安全问题? 同步机制: 有三种方式.
 */

class Account {

}

class Customer extends Thread {
    private Account acct;

    public Customer(Account acct) {
        this.acct = acct;
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account();
        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);


    }
}
