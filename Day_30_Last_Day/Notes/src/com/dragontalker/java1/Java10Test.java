package com.dragontalker.java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

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
    }
}
