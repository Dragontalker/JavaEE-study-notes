package com.dragontalker.java1;

/*
static关键字的使用

1. static: 静态的
2. static可以用来修饰: 属性、方法、代码块、内部类

3. 使用static修饰属性:

4. 使用static修饰方法:
 */

public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.name = "迪丽热巴";
        c1.age = 25;

        Chinese c2 = new Chinese();
        c2.name = "高圆圆";
        c2.age = 39;

        c1.nation = "CHN";
        System.out.println(c2.nation);

        c2.nation = "CHINA";
        System.out.println(c1.nation);
    }
}

class Chinese {
    String name;
    int age;
    static String nation;
}