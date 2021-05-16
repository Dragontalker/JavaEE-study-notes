package com.dragontalker.exer;

/*
一道面试题

 */

public class StringTest {
    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};

    public void change(String str, char[] ch) {
        str = "test ok"; //String有不可变性, 和一般传递的形参不一样
        ch[0] = 'b'; //数组是可变的
    }

    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str); //good
        System.out.println(ex.ch); //best
    }
}
