package com.dragontalker;

/*
数据结构:
    1. 数据与数据之间的逻辑关系: 集合, 一对一, 一对多, 多对多
    2. 数据的储存结构:
        线性表: 顺序表(比如: 数组), 链表, 栈, 队列
        树形结构: 二叉树
        图形结构: 最短路径

算法:
排序算法:
搜索算法:
 */

public class ArrayReview {

    public static void main(String[] args) {

        String[] strs = new String[5]; // {null, null, null, null, null} => 0x89ab
        strs[2] = "Tom"; // {null, null, "Tom", null, null} => 0x89ab
        strs = new String[3]; // {null, null, null} => new address: 0x778
    }
}
