package com.dragontalker.java;

/*
抽象类的应用: 模板方法的设计模式
 */

public class TemplateTest {
}

abstract class Template {

    // 计算某段代码执行所需要花费的时间
    public void spendTime() {
        long start = System.currentTimeMillis();

        code(); // 不确定的部分, 易变的部分

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为: " + (end - start));
    }

    public abstract void code();
}
