package com.dragontalker.example1;

/*
方法的重写(override/overwrite)
    1. 重写: 子类继承父类以后, 可以对父类中同名同参数的方法, 进行覆盖操作
    2. 应用: 重写以后, 当创建子类对象以后, 通过子类对象调用子父类中的同名同参数的方法时, 实际执行的是子类的方法
    3. 重写的规定:
        - 方法的声明: 权限修饰符 返回值类型 方法名(形参列表) {方法体}
        - 约定俗称: 子类中的叫重写的方法, 父类中叫被重写的方法
            1. 子类重写的方法名和形参列表与父类被重写的方法名和形参列表相同
            2. 子类重写的方法的权限修饰符不小于父类被重写的方法的权限修饰符

面试题: 区分方法的重载与重写
 */

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.eat();
        s.walk(10);
        s.study();
    }
}
