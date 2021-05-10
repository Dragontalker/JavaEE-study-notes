package com.dragontalker.java;

public class PersonTest {
    public static void main(String[] args) {
        Person p2 = new Man();
        p2.eat();
        p2.walk();

        System.out.println(p2.id); // 1001
        //p2.earnMoney(); 不能调用子类特有的方法, p2现在是Person类型
        //p2.isSmoking = true; 子类特有的属性也不能调用
    }
}
