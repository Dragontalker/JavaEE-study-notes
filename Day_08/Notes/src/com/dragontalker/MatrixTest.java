package com.dragontalker;

public class MatrixTest {
    public static void main(String[] args) {
        MatrixTest test = new MatrixTest();
        test.method();
    }

    public void method() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
