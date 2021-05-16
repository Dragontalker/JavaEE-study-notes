package com.dragontalker.java;

import org.junit.Test;

public class StringMethodTest {

    /*

     */
    @Test
    public void test1() {
        String s1 = "Hello world!";

        //1. int length()
        System.out.println(s1.length());

        //2. char charAt(int index)
        System.out.println(s1.charAt(0));

        //3. boolean isEmpty()
        System.out.println(s1.isEmpty());
    }
}
