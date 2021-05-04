package com.dragontalker;

public class ForTest1 {

    public static void main(String[] args) {

        for (int i = 1; i < 151; i++) {
            System.out.print(i + " ");

            if (i % 3 == 0) {
                System.out.print("foo ");
            }

            if (i % 5 == 0) {
                System.out.print("biz ");
            }

            if (i % 7 == 0) {
                System.out.print("baz ");
            }

            // 换行
            System.out.print("\n");
        }
    }
}
