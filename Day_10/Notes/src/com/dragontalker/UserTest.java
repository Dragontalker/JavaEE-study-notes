package com.dragontalker;

/*
总结: 属性赋值的先后顺序
    1. 默认初始化值
    2. 显式初始化值
    3. 构造器中赋值
    4. 通过“对象.方法”或“对象.属性”的方式赋值

以上操作的先后顺序: 1 --> 3 --> 2 --> 4
 */

public class UserTest {
    public static void main(String[] args) {
        User u = new User();
        System.out.println(u.age);

        //User u1 = new User(2);
        //System.out.println(u1.age);
    }
}

class User {
    String name;
    int age = 1;

    public void User() {}

    public void User(int a) {
        age = a;
    }
}
