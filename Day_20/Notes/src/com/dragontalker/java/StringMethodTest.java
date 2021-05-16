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

        //6. boolean equals()
        System.out.println(s1.equals(s4.trim()));
    }

    @Test
    public void test2() {

        //7. boolean equalsIgnoreCase()
        String s1 = "Hello world!";
        String s2 = "hello world!";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        //8. int compareTo()
        //涉及到字符串的排序
        String s5 = "abc"; //a, b, c ---> 97, 98, 99
        String s6 = new String("abe"); //a, b, e ---> 97, 98, 101
        System.out.println(s5.compareTo(s6)); //99 - 101 = -2

        //9 String substring()
        String s7 = "北京尚硅谷教育";
        String s8 = s7.substring(2);
        System.out.println(s7);
        System.out.println(s8);

        System.out.println(s7.substring(2, 5));
    }

    @Test
    public void test3() {
        //1. boolean endsWith()/startsWith()
        String s1 = "Hello world!";
        System.out.println(s1.startsWith("h"));
        System.out.println(s1.endsWith("e"));

        //2 boolean startsWith(String prefix, int toffset)
        System.out.println(s1.startsWith("ll", 2));
    }

    @Test
    public void test4() {
        //1. boolean contains(CharSequence s)
        String s1 = "Hello world!";
        System.out.println(s1.contains("world"));

        //2. int indexOf(String s)
        System.out.println(s1.indexOf("world"));
        System.out.println(s1.indexOf("LOL"));
    }
}
