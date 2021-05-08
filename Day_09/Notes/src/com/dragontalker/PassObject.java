package com.dragontalker;

public class PassObject {

    public static void main(String[] args) {
        PassObject test = new PassObject();

        test.printAreas(new Circle(), 5);
    }

    public void printAreas(Circle c, int time) {

        System.out.println("Radius\t\tArea");

        // 设置圆的半径
        for (int i = 1; i <= time; i++) {
            // 设置圆的半径
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }
    }
}
