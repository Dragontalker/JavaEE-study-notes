package com.dragontalker;

public class TernaryTest {

    public static void main(String[] args) {
        int m = 12;
        int n = 5;
        int max = (m > n) ? m : n;
        System.out.println(max);

        // 获取三个数的最大值
        int n1 = 12;
        int n2 = 30;
        int n3 = -43;

        int max1 = (n1 > n2) ? n1 : n2;
        int max2 = (max1 > n3) ? max1 : n3;
        System.out.println("三个数中的最大值为: " + max2);
    }
}
