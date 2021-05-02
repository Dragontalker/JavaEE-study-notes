package com.dragontalker;

public class SetValueTest {

    public static void main(String[] args) {

        int i1 = 10;
        int j1 = 10;

        int i2, j2;
        i2 = j2 = 10;

        int i3 = 10, j3 = 10;

        int num1 = 10;
        num1 += 2;
        System.out.println(num1); // 12

        short s1 = 10;
        // s1 = s1 + 2; causing compile error
        s1 += 2;
        System.out.println(s1);

        // Ways to incremental by 2
        // 1st way: num = num + 2;
        // Best way: num += 2; (Does not change data type)

        // Ways to incremental by 1
        // 1st way: num = num + 1;
        // 2nd way: num += 1; (Does not change data type)
        // Best way: num++;
    }
}
