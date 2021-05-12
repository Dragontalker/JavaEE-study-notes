package com.dragontalker.java3;

/*
final: 最终的

1. final可以用来修饰类、方法、变量

2. final用来修饰一个类: 此类不能被其他类所继承
    - 比如: String类、System类、StringBuffer类

3. final用来修饰一个方法: 表明此方法不能被重写
    - 比如: Object类中的getClass()

4. final用来修饰变量: 此时的“变量”就称为是一个常量
    4.1 final修饰属性: 可以考虑赋值的位置有: 显式初始化、代码块初始化、构造器中初始化
 */

public class FinalTest {

    //final int width; 不允许
    final int width = 10;

    public void changeWidth() {
        //width = 20;
    }

    final int WIDTH = 0;
    final int LEFT;
    final int RIGHT;
    //final int DOWN;

    {
        LEFT = 1;
    }

    public FinalTest() {
        RIGHT = 2;
    }

    public FinalTest(int n) {
        RIGHT = n;
    }

//    public void setDown(int down) {
//        this.DOWN = down;
//    }
}

final class FinalA {

}

//class B extends FinalA {}
//class C extends String {}

class AA {
    public final void show() {}
}

class BB extends AA {
    //@Override
    //public void show() {}
}
