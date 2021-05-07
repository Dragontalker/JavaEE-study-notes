package com.dragontalker;

/*
可变个数形参的方法

1. jdk 5.0新增的内容
2. 具体使用:
    2.1 可变个数形参的格式: 数据类型 ... 变量名

 */

public class MethodArgsTest {

    public void show(int i) {}

    public void show(String s) {}

    public void show(String ... strs) {}
}
