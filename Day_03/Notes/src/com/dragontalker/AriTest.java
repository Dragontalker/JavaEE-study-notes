package com.dragontalker;

public class AriTest {

    public static void main(String[] args) {

        // division:
        int num1 = 12;
        int num2 = 5;
        int result1 = num1 / num2;
        System.out.println(result1); // 2

        int result2 = num1 / num2 * num2;
        System.out.println(result2); // 10

        double result3 = num1 / num2;
        System.out.println(result3); // 2.0

        double result4 = num1 / num2 + 0.0;
        System.out.println(result4); // 2.0

        double result5 = num1 / (num2 + 0.0);
        System.out.println(result5); // 2.4

        double result6 = (double)num1 / num2;
        System.out.println(result6); // 2.4

        double result7 = (double)(num1 / num2);
        System.out.println(result7); // 2.0


        // remainder
        int m1 = 12;
        int n1 = 5;
        System.out.println("m1 % n1 = " + m1 % n1); // 2
    }
}
