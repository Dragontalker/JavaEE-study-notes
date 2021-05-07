package com.dragontalker;

/*
一、理解“万事万物皆对象”
    1. 在Java语言范畴中, 我们都将功能、结构等封装到类中, 通过类的实例化, 来调用具体的功能结构.
        >Scanner, String等
        >File等
        >网络资源, URL
    2. 涉及到Java语言与前端HTML, 后端的数据库交互时, 前后端的结构在Java层面交互时, 都体现为类、对象.

二、内存解析的说明
    1. 引用类型的变量, 只可能存储两类值: null 或 地址值(含变量的类型).

三、匿名对象的使用
 */

public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p); // 内存地址

        p.sendEmail();
        p.playGame();

        // 匿名对象
        new Phone().sendEmail();
        new Phone().playGame();
    }
}

class Phone {
    double price; // 价格

    public void sendEmail() {
        System.out.println("发送邮件");
    }

    public void playGame() {
        System.out.println("玩游戏");
    }

}
