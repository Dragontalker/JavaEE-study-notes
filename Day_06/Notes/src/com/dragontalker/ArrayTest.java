package com.dragontalker;

/*
数组的特点:
    1. 数组是有序排列的;
    2. 数组属于引用数据类型的变量. 数组的元素，既可以是基本数据类型，也可以是引用数据类型;
    3. 创建数组对象会在内存中开辟一整块连续的空间;
    4. 数组的长度一旦确定，就不能修改.

数组的分类:
    1. 按照维度: 1维数组，2维数组，...
    2. 按照数组元素的类型: 基本数据类型/引用数据类型

1维数组的使用:
    1. 一维数组的声明和初始化;
    2. 如何调用数组的指定位置和元素;
    3. 如何获取数组的长度;
    4. 如何遍历数组;
    5. 数组元素的默认初始化值;
    6. 数组的内存解析.
 */

public class ArrayTest {

    public static void main(String[] args) {

        // 1. 一维数组的声明和初始化;
        int num; // 声明
        num = 10; // 初始化
        int id = 1001; // 声明 + 初始化

        int[] ids; // 声明
        // 1.1 静态初始化: 数组的初始化和数组元素的赋值操作同时进行
        ids = new int[]{1001, 1002, 1003, 1004};
        // 1.2 动态初始化: 数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[5];

        // 错误的写法
        // int[] arr1 = new int[];
        // int[5] arr2 = new int[];
        // int[] arr3 = new int[3]{1, 2, 3}

        // 总结: 数组一旦初始化完成, 其长度就确定了.

        // 2. 如何调用数组的指定位置和元素;
        // 通过角标的方式调用.
        // 数组的角标(或索引)从0开始, 到数组的长度-1结束.
        names[0] = "王铭";
        names[1] = "王赫";
        names[2] = "张学良";
        names[3] = "孙君龙";
        names[4] = "王宏志";

        // 3. 如何获取数组的长度;
        // 属性: length
        System.out.println(names.length);
        System.out.println(ids.length);

        // 4. 如何遍历数组;
        for (int i = 0; i < names.length; i++) {
            System.out.println("#" + (i + 1) + ": " + names[i]);
        }
    }
}
