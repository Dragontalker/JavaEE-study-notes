package com.dragontalker;

public class Main {

    public static void main(String[] args) {

        // Exercise
        int num = 187;
        int baiWei = num / 100;
        System.out.println("百位为" + baiWei);

        int shiWei = num % 100 / 10;
        System.out.println("十位为" + shiWei);

        int geWei = num % 10;
        System.out.println("个位为" + geWei);

    }
}
