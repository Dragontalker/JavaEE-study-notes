package com.dragontalker;

/*
面向对象的特征一: 封装与隐藏
 */

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "大黄";
        a.age = 1;
        //a.legs = 4; // The field Animal.legs is not visible

        a.setLegs(6); // a.legs = 6
        a.setLegs(-6); // a.legs = 0
        a.show();
    }
}

class Animal {
    String name;
    int age;
    private int legs;

    public void setLegs(int num) {
        if (num >= 0 && num % 2 == 0) {
            legs = num;
        } else {
            legs = 0;
        }
    }

    public void eat() {
        System.out.println("动物进食");
    }

    public void show() {
        System.out.println("name = " + name + ", age = " + age + ", legs = " + legs);
    }
}
