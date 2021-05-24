package com.dragontalker.java;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
    //反射之前, 对于Person类的操作
    @Test
    public void test1() {
        //1. 创建Person类的对象
        Person p1 = new Person("Tom", 12);

        //2. 通过对象调用其内部的属性和方法
        p1.age = 10;
        System.out.println(p1);

        p1.show();

        //Person类外部, 不可以通过Person类的对象调用其私有的结构的
        //比如: name属性, showNation()方法, 已经私有的Person(String name)构造器
    }

    //反射之后, 对于Person类的操作
    @Test
    public void test2() throws Exception {
        Class clazz = Person.class;
        //1. 通过反射, 创建Person类的对象
        Constructor cons = clazz.getConstructor(String.class, int.class);

        Object obj = cons.newInstance("Tom", 12);
        Person p = (Person) obj;
        System.out.println(p);

        //2. 通过反射, 调用对象指定的属性、方法
        //调用属性
        Field age = clazz.getDeclaredField("age");
        age.set(p, 10);
        System.out.println(p);

        //调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(p);

        //通过反射, 可以调用Person类的私有结构的, 比如: 私有的构造器, 方法, 属性
        //调用私有的属性和方法
        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Object p1 = (Person) cons1.newInstance("Jerry");
        System.out.println(p1);

        //调用私有的属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1, "HanMeiMei");
        System.out.println(p1);

        //调用私有的方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        Object nation = showNation.invoke(p1, "中国");//相当于String nation = p1.showNation("中国");
        System.out.println(nation);
    }

    //疑问1: 通过直接new的方式或反射的方式都可以调用公共的结构, 开发中到底用哪个?
    //建议: 直接new的方式
    //什么时候会使用: 反射的方式 ---> 反射的特征: 动态性

    //疑问2: 反射机制与面向对象中的封装性是不是矛盾的? 如何看待两个技术?
    //不矛盾!

    /*
    关于java.lang.Class类的理解
    1. 类的加载过程:
        - 程序经过javac.exe命令后, 会生成一个或多个字节码文件(.class结尾)
        - 接着我们使用java.exe命令对某个字节码文件进行解释运行
        - 相当于将某个字节码文件加载到内存中
        - 此过程就称为类的加载
        - 加载到内存中的类就称为运行时类
        - 此运行时类就作为Class的一个实例

    2. 换句话说, Class的实例就对应着一个运行时类
    3. 加载到内存中的运行时类, 会缓存一定的时间,
        在此时间之类, 我们可以通过不同的方式来获取此运行时类
     */

    //获取Class的实例方式(前三种方式需要掌握)
    @Test
    public void test3() throws ClassNotFoundException {
        //方式一: 调用运行时类的属性
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);

        //方式二: 通过运行时类的对象, 调用getClass()
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);

        //方式三: 调用Class的静态方法: forName(String classPath)
        Class clazz3 = Class.forName("com.dragontalker.java.Person");
        System.out.println(clazz3);

        System.out.println(clazz1 == clazz2); //true
        System.out.println(clazz1 == clazz3); //true

        //方式四: 使用类的加载器: ClassLoader(了解就可以)
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("com.dragontalker.java.Person");
        System.out.println(clazz4);

        System.out.println(clazz1 == clazz4);
    }

    //万事万物皆对象? 对象.xxx, File, URL, 反射, 前端, 数据库操作
}
