package com.dragontalker.java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Java10Test {
    /*
    局部变量的类型推断
     */
    @Test
    public void test1() {
        //1. 声明变量时, 根据所附的值, 推断变量的类型
        var num = 10;

        var list = new ArrayList<String>();
        list.add("Hello!");
        System.out.println(list);

        //2. 遍历操作
        for (var i : list) {
            System.out.println(i);
            System.out.println(i.getClass());
        }

        //3. 普通的遍历操作
        for(var i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    @Test
    public void test2() {
        //1. 局部变量不赋值, 就不能实现类型推断
        //var num; 当没有赋值时, 类型推断无法执行, 报错

        //2. Lambda表达式中, 左边的函数式接口不能声明为var
        Supplier<Double> sup = Math::random;
        //var sup = Math::random; 无法推断出用的函数式接口是什么

        //3. 方法引用中, 左边的函数式接口不能声明为var
        Consumer<String> con = System.out::println;
        //var con = System.out::println;

        //4. 数组的静态初始化中, 注意如下的情况也不可以
        int[] arr1 = {1, 2, 3};
        var arr2 = new int[]{1, 2, 3};
        //var arr3 = {1, 2, 3}
    }

    @Test
    public void test3() {
        //情况1: 没有初始化的局部变量声明
        //var s = null;

        //情况6: catch快
//        try {
//
//        } catch (var e) {
//
//        }
    }

    //情况2: 方法的返回值类型
//    public var method1() {
//        return 0;
//    }

    //情况3: 方法的参数类型
//    public void method2(var num) {}

    //情况4: 构造器的参数类型
//    public Java10Test(var num) {}

    //情况5: 属性
//    var num = 10;
}
