package com.dragontalker.java;

/**
 * 使用Enum关键字来定义枚举类
 */

public class SeasonEnumTest {
}

//使用enum关键字枚举类
enum EnumSeason {
    //1. 提供当前枚举类的对象, 多个对象之间用","隔开, 末尾的对象用";"结束
    SPRING ("春天", "春暖花开"),
    SUMMER ("夏天", "夏日炎炎"),
    AUTUMN ("秋天", "秋高气爽"),
    WINTER ("冬天", "冰天雪地");

    //2. 声明Season对象的属性: private final 修饰
    private final String seasonName;
    private final String seasonDesc;

    //3. 私有化类的构造器, 并给对象属性初始化
    private EnumSeason(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
}
