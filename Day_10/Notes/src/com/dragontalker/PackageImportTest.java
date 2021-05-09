package com.dragontalker;

/*
一、package关键字的使用
    1. 为了更好的实现项目中类的管理, 提供包的概念
    2. 使用package声明类或者接口所属的包, 声明在源文件的首行
    3. 包, 属于标识符, 遵顼标识符的命名规则、 规范(xxx.yyy.zzz)、“见名如意”
    4. 每"."第一次, 就代表一层文件目录

    补充:
        - 同一个包下, 不能命名同名的接口、类
        - 不同的包下, 可以命名同名的接口、类

二、import关键字的使用
    1. import: 导入
    2. 在源文件中显式的使用import结构导入指定包下的类、接口
    3. 声明在包的声明和类的声明之间
    4. 如果需要导入多个结构, 则并列写出即可
    5. 可以使用"xxx.*"的方式, 表示可以导入xxx包下的所有结构
 */

import com.dragontalker.bank.Bank;

import java.util.Arrays;

public class PackageImportTest {
    public static void main(String[] args) {
        String info = Arrays.toString(new int[]{1, 2, 3});
        System.out.println(info);

        Bank bank = new Bank(10);
    }
}
