package com.dragontalker;

public class SwitchTest1 {

    public static void main(String[] args) {

        int score = (int)(Math.random() * 100);
        int pass = score / 60;
        switch (pass) {
            case (1):
                System.out.println("You scored " + score + "! You passed!");
                break;
            default:
                System.out.println("Your scored " + score + "! Your failed!");
                break;
        }

    }
}
