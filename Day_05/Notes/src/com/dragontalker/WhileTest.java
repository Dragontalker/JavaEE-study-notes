package com.dragontalker;

/*
While 循环的使用
*/

public class WhileTest {

    public static void main(String[] args) {
        int i = 1;
        while(i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
