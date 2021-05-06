package com.dragontalker;

/*
类中方法的声明和使用

方法: 描述类应该具有的功能.
    比如: Math类: sqrt()\random()\...
         Scanner类: nextXxx() ...
         Array类: sort() \ binarySearch() \ toString() \ equals() \ ...

方法的声明: 权限修饰符 返回值类型 方法名(形参列表) {方法体}
 */

public class CustomerTest {
    public static void main(String[] args) {

    }
}

// 客户类
class Customer {

    // 属性
    String name;
    int age;
    boolean isMale;

    // 方法
    public void eat() {
        System.out.println("客户吃饭");
    }

    public void sleep(int hour) {
        System.out.println("休息了" + hour + "个小时");
    }

    public String getName() {
        return name;
    }

    public String getNation(String nation) {
        String info = "我的国籍是: " + nation;
        return info;
    }
}
