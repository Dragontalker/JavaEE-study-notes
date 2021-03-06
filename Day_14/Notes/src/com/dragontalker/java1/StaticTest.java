package com.dragontalker.java1;

/*
static关键字的使用

1. static: 静态的
2. static可以用来修饰: 属性、方法、代码块、内部类

3. 使用static修饰属性: 静态变量(类变量)
    3.1 属性：按是否使用static修饰， 又分为：静态属性 vs 非静态属性(实例变量)

    - 实例变量: 我们创建了类的多个对象, 每个对象都独立的拥有一套类中的非静态属性
        当修改其中一个对象的非静态属性时, 不会导致其他对象中同样的属性值的修改

    - 静态变量: 我们创造了类的多个对象, 多个对象共享同一个变量
        当通过某一个对象修改静态变量时, 会导致其他对象调用此静态变量时, 是修改过了的

    3.2 static修饰属性的其他说明:
        - 静态变量随着类的加载而加载, 可以通过"类.静态变量"的方式进行调用
        - 静态变量的加载早于对象的创建
        - 由于类只会加载一次, 则静态变量在内存中也只会存在一份, 存在方法区的静态域中

                | 类变量(static) | 实例变量(non-static)
        类             yes               no(编译不通过)
        对象           yes               yes

    3.3 静态属性举例: System.out; Math.PI;

4. 使用static修饰方法:

    4.1 随着类的加载而加载, 可以通过"类.静态方法"的方式进行调用

                    | 类变量(static) | 实例变量(non-static)
        类                yes            no(编译不通过)
        对象              yes                 yes

    4.2 静态方法中只能调用静态的方法或属性, 因为它们的生命周期一致
        - 非静态方法中, 既可以调用非静态的方法或属性, 也可以调用静态的方法或属性

5. static注意点
    - 在静态的方法内, 不能使用this或者super关键字
    - 关于静态属性和静态方法的使用, 大家都从生命周期的角度去理解

6. 开发中, 如何确定一个属性是否声明为static?
    > 属性是可以被多个对象共享的, 不会随着对象的不同而不同的
    > 类中的常量也常常声明为static

7. 开发中, 如何确定一个方法是否声明为static?
    > 操作静态属性的方法, 通常设置为静态的
    > 工具类中的方法, 习惯上声明为static, 比如: Math, Arrays, Collections
 */

public class StaticTest {
    public static void main(String[] args) {
        Chinese.show();
        Chinese.nation = "中国";
        Chinese.show();
        System.out.println(Chinese.nation);

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

    public void eat() {
        // 调用非静态结构
        this.info();
        System.out.println("中国人吃中餐");
    }

    public void info() {
        System.out.println("我们是中国人");
    }

    public static void show() {
        System.out.println("我来自" + Chinese.nation); // nation其实是Chinese.nation

        // 可以调用静态的结构
        Chinese.walk();
    }

    public static void walk() {}
}
