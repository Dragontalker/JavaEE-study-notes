package com.dragontalker;

public class MatrixTest {
    public static void main(String[] args) {
        MatrixTest test = new MatrixTest();
        test.printMatrix();
        System.out.println("面积为: "+ test.getArea());
        test.printCustomMatrix(3, 2);
    }

    public void printMatrix() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public int getArea() {
        return 10 * 8;
    }

    public void printCustomMatrix(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
