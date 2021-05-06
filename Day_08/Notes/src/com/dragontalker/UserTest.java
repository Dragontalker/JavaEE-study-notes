package com.dragontalker;

/*
类中属性的使用

属性(成员变量) vs 局部变量
1. 相同点
    1.1. 定义变量的格式: 数据类型 变量名 = 变量值
    1.2. 先声明, 后使用
    1.3. 变量都有其对应的作用域

2. 不同点
    2.1. 在类中声明的位置的不同
        属性: 直接定义在类的一对{}内
        局部变量: 声明在方法内、方法形参、代码快内、构造器形参、构造器内部的变量
 */

public class UserTest {

}

class User {
    // 属性(或成员变量)
    String name;
    int age;

    public void talk(String language) { // language: 形参, 也是局部变量
        System.out.println("我们使用" + language + "进行交流");
    }

    public void eat() {
        String food = "烙饼";
        System.out.println("北方人喜欢吃: " + food);
    }
}
