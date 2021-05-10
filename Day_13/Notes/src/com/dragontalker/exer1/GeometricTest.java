package com.dragontalker.exer1;

public class GeometricTest {
    public static void main(String[] args) {

    }

    public void displayGeometricObject(GeometricObject o) {
        System.out.println("面积为: " + o.findArea());
    }

    // 测试两个对象的面积是否相等
    public boolean equalsArea(GeometricObject o1, GeometricObject o2) {
        return o1.findArea() == o2.findArea();
    }
}
