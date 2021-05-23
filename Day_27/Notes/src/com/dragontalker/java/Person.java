package com.dragontalker.java;

import java.io.Serializable;

/**
 * Person需要满足如下的要求, 方可序列化
 * 1. 需要实现接口: Serializable
 * 2. 当前类提供一个全局常量: serialVersionUID
 * 3. 除了当前Person类许需要实现Serializable接口之外, 还需要保证其内部所有属性
 *  也必须是可序列化的(默认情况下, 基础数据类型都是可序列化的)
 */

public class Person implements Serializable {
    public static final long serialVersionUID = 475463534532L;

    private String name;
    private int age;
    private Account account;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Account implements Serializable{
    public static final long serialVersionUID = 475463534542L;

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
