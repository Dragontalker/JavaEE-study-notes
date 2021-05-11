package com.dragontalker.java3;

/*
final: 最终的

1. final可以用来修饰类、方法、变量

2. final用来修饰一个类: 此类不能被其他类所继承
    - 比如: String类、System类、StringBuffer类

3. final用来修饰一个方法: 表明此方法不能被重写
    - 比如: Object类中的getClass()

4. final用来修饰变量: 此时的“变量”就称为是一个常量
 */

public class FinalTest {
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
