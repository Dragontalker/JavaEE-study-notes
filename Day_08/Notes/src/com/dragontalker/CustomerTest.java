package com.dragontalker;

/*
类中方法的声明和使用

方法: 描述类应该具有的功能.
    比如: Math类: sqrt()\random()\...
         Scanner类: nextXxx() ...
         Array类: sort() \ binarySearch() \ toString() \ equals() \ ...

方法的声明: 权限修饰符 返回值类型 方法名(形参列表) {方法体}
    static, final, abstract 来修饰的方法, 后面再讲

说明:
    1. 关于权限修饰符: 默认方法的权限修饰符都使用public
        Java规定的4中权限修饰符: private, public, 缺省, protected

    2. 返回值类型: 有返回值 vs 没有返回值
        2.1. 如果方法有返回值, 则必须在方法声明时, 指定返回值的类型, 同时方法中使用return关键字
            - 如果方法没有返回值, 使用void来表示
            - 通常, 没有返回值的方法中不需要return, 如果使用的话, 只能 return;

        2.2. 我们定义方法的时候该不该有返回值?
            - 题目要求
            - 凭经验: 具体问题具体分析

     3. 方法名: 属于标识符, 遵循标识符的规则和规范
     4. 形参列表: 方法可以声明0个, 1个, 或多个形参.
            格式: 数据类型1 形参1, 数据类型2 形参2

return关键字的使用:

 */

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.eat();
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
