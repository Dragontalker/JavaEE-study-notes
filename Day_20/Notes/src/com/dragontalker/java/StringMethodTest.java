package com.dragontalker.java;

import org.junit.Test;

import java.util.Locale;

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

        //4. String toLowerCase()
        String s2 = s1.toLowerCase();
        System.out.println(s2);
        System.out.println(s1); //s1是不可变的

        //4. String toUpperCase()
        String s3 = s1.toUpperCase();
        System.out.println(s3);
        System.out.println(s1);

        //5. String trim()
        String s4 = " Hello world! ";
        System.out.println(s4.length());
        System.out.println(s4.trim().length());
    }
}
