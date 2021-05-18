package com.dragontalker.java;

/**
 * 使用Enum关键字来定义枚举类
 * 说明: 定义的枚举类默认继承于Enum类
 */

public class SeasonEnumTest {
    public static void main(String[] args) {
        EnumSeason summer = EnumSeason.SUMMER;

        //toString()
        System.out.println(summer);
        System.out.println(summer.getSeasonName());
        System.out.println(summer.getSeasonDesc());

        //System.out.println(EnumSeason.class.getSuperclass());

        //values()
        EnumSeason[] values = EnumSeason.values();
        for (EnumSeason value : values) {
            System.out.println(value);
        }

        Thread.State[] values1 = Thread.State.values();
        for (Thread.State state : values1) {
            System.out.println(state);
        }

        //valuesOf(String objName): 返回枚举类中对象名是objName的对象
        EnumSeason winter = EnumSeason.valueOf("WINTER");
        System.out.println(winter);

        //如果没有objName的枚举类对象, 则抛异常
        //EnumSeason winter1 = EnumSeason.valueOf("WINTER1");
        //System.out.println(winter1); // IllegalArgumentException
    }
}

interface Info {
    void show();
}

//使用enum关键字枚举类
enum EnumSeason implements Info{
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

    @Override
    public void show() {
        System.out.println("这是一个季节");
    }
}
