package com.dragontalker.java1;

/*
接口的使用:
    1. 接口使用interface来定义
    2. Java中, 接口和类是并列的两个结构
    3. 如何定义接口, 定义接口中的成员

        3.1 JDK7及以前:
            > 只能定义全局常量和抽象方法
            > 全局常量: public static final
            > 抽象方法: public abstract

        3.2 JDK8:
            > 除了定义全局常量和抽象方法外, 还可以定义静态方法, 默认方法(略)
 */

public class InterfaceTest {
}

interface Flyable {

    //全局常量
    public static final int MAX_SPEED = 7900; //第一宇宙速度
}
