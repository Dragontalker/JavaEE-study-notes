package com.dragontalker.java1;

import org.junit.Test;

import java.lang.annotation.Annotation;

/**
 * 注解的使用
 *
 * 1. 理解Annotation
 *  - jdk5.0新增
 *  - Annotation就是代码中标记的特殊信息
 *  - 代替XML配置
 *
 * 2. Annotation的使用实例
 *  示例一: 生成文档时的注解
 *  示例二: @Override @Deprecated @SuppressWarnings
 *
 * 3. 如何自定义注解: 参照SuppressWarnings定义
 *  3.1 注解声明为: @interface
 *  3.2 内部定义成员, 通常用value表示
 *  3.3 可以指定成员的默认值, 使用default定义
 *  3.4 如果自定义注解没有成员, 表明是一个表示作用
 *
 * 如果注解有成员, 在使用注解时, 需指定成员的值
 * 自定义注解必须配上注解的信息处理流程(使用反射)才有意义
 * 自定义注解通常都会指明两个元注解: Retention, Target
 *
 * 4. jdk提供的4种元注解:
 *  - 元注解: 对现有的注解进行解释说明的注解
 *  - Retention: 指定所修饰的Annotation的生命周期: Source(默认行为), Class, RUNTIME
 *      - 只有声明为RUNTIME生命周期的注解, 才能通过反射获取
 *  - Target: 用于修饰Annotation的定义, 用于指定能修饰哪些元素
 *  - Documented: 表示所修饰的注解在被javadoc解析时, 保留下来
 *  - Inherited: 被它修饰的Annotation具有继承性
 *
 * 5. 通过放射获取注解信息 --- 到反射内容时系统讲解
 *
 * 6. jdk8中注解的新特性: 可重复注解、类型注解
 *  6.1 可重复注解:
 *
 */

public class AnnotationTest {
    public static void main(String[] args) {
        Person p = new Student();
        p.walk();
    }

    @Test
    public void testGetAnnotation() {
        Class<Student> clazz = Student.class;
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}


class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @MyAnnotation
    public void walk() {
        System.out.println("人走路");
    }

    public void eat() {
        System.out.println("人吃饭");
    }
}

interface Info {
    void show();
}

//这里自动继承了MyAnnotation
class Student extends Person implements Info{
    @Override
    public void walk() {
        System.out.println("学生走路");
    }

    @Override
    public void show() {
        System.out.println("这是一个学生");
    }
}
