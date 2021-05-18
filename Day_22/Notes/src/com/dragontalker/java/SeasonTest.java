package com.dragontalker.java;

/**
 * 一、枚举类的使用
 *  1. 枚举类的理解: 类的对象只有有限个, 确定的. 我们称此类为枚举类
 *  2. 当需要顶定义一组常量时, 强烈建议使用枚举类
 *  3. 如果枚举类中只有一个对象, 则可以作为单例模式的实现方式
 *
 * 二、 如何定义枚举类
 *  方式一: jdk5.0之前, 自定义枚举类
 *  方式二: jdk5.0时, 我们可以使用enum关键字定义枚举类
 *
 */

public class SeasonTest {
}

//自定义枚举类
class Season {
    //1. 声明Season对象的属性: private final 修饰
    private final String seasonName;
    private final String seasonDesc;

    //2. 私有化类的构造器
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
}
