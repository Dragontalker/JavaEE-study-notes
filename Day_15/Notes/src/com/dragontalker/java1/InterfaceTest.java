package com.dragontalker.java1;

/*
接口的使用:
    1. 接口使用interface来定义
    2. Java中, 接口和类是并列的两个结构
    3. 如何定义接口, 定义接口中的成员

        3.1 JDK7及以前:
            > 只能定义全局常量和抽象方法
            > 全局常量: public static final的, 但是可以忽略不写
            > 抽象方法: public abstract的, 但是可以忽略不写

        3.2 JDK8:
            > 除了定义全局常量和抽象方法外, 还可以定义静态方法, 默认方法(略)

    4. 接口中不能定义构造器的! 意味着接口不能实例化!

    5. Java开发中, 接口通过让类去实现(implements)的方式来使用
        - 如果实现类覆盖了接口中的所有抽象方法, 则此实现类就可以实例化
        - 如果实现类没有覆盖接口中的所有抽象方法, 则此类仍是抽象类
 */

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
    }
}

interface Flyable {

    //全局常量
    int MAX_SPEED = 7900; //第一宇宙速度
    int MIN_SPEED = 1; //省略了public static final

    //抽象方法
    public abstract void fly();

    //省略了public abstract
    void stop();
}

class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}
