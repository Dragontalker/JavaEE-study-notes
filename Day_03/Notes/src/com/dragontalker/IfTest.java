package com.dragontalker;

public class IfTest {

    public static void main(String[] args) {

        // 举例1
        int heartBeats = 79;
        if (heartBeats < 60 || heartBeats > 100) {
            System.out.println("需要做进一步检查");
        } else {
            System.out.println("检查结束");
        }
    }
}
