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

    //2. 私有化类的构造器, 并给对象属性初始化
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3. 提供当前枚举类的多个对象: public static final的
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "冰天雪地");

    //4. 其他诉求1: 获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //5. 其他诉求2: 提供toString()方法

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
