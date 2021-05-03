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

        // 举例2
        int age = 23;
        if (age < 18) {
            System.out.println("你还可以看动画片");
        } else {
            System.out.println("你可以看成人电影了");
        }
    }
}
