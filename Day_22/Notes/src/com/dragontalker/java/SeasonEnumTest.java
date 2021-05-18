package com.dragontalker.java;

/**
 * 使用Enum关键字来定义枚举类
 * 说明: 定义的枚举类默认继承于Enum类
 */

public class SeasonEnumTest {
    public static void main(String[] args) {
        EnumSeason summer = EnumSeason.SUMMER;
        System.out.println(summer);
        System.out.println(summer.getSeasonName());
        System.out.println(summer.getSeasonDesc());

        System.out.println(EnumSeason.class.getSuperclass());
    }
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

    //4. 其他诉求1: 获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
}
