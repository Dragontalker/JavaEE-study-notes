package com.dragontalker;

public class ArrayReview {

    public static void main(String[] args) {

        String[] strs = new String[5]; // {null, null, null, null, null} => 0x89ab
        strs[2] = "Tom"; // {null, null, "Tom", null, null} => 0x89ab
        strs = new String[3]; // {null, null, null} => new address: 0x778
    }
}
