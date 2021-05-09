package com.dragontalker.java4;

public class Man extends Person{
    private boolean isSmoking;

    public void earnMoney() {
        System.out.println("男人负责挣钱养家");
    }

    @Override
    public void eat() {
        System.out.println("男人多吃肉, 长肌肉");
    }

    @Override
    public void walk() {
        System.out.println("男人霸气的走路");
    }
}
