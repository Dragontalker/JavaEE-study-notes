package com.dragontalker.exer3;

public class ComparableCircleTest {
    public static void main(String[] args) {

        ComparableCircle c1 = new ComparableCircle(3.4);
        ComparableCircle c2 = new ComparableCircle(3.2);

        int comparableValue = c1.compareTo(c2);
        if (comparableValue > 0) {
            System.out.println("c1对象大");
        } else if (comparableValue < 0) {
            System.out.println("c2对象大");
        } else {
            System.out.println("c1与c2一样大");
        }

    }
}
