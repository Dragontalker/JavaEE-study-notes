package com.dragontalker;

/*
面向对象的特征一: 封装与隐藏

一、问题的引入
    - 当我们创建一个类的对象以后, 我们可以通过"对象.属性"的方式, 对对象属性进行赋值.
    - 这里，赋值操作要收到属性的数据类型和储存范围的制约. 除此之外, 没有其他制约条件.
    - 但是, 在实际问题中, 我们往往需要给属性赋值加入额外的条件.
    - 这个条件不能在属性声明时体现, 我们只能通过方法进行限制条件的添加.
    - 同时, 我们需要避免用户再使用"对象.属性"进行赋值.
    ---> 此时, 体现了封装性.

二、封装性的体现:
    - 我们将类的属性私有化(private), 同时, 提供公共的(public)方法来获取(getXxx)和设置(setXxx).
 */

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "大黄";
        //a.age = 1;
        //a.legs = 4; // The field Animal.legs is not visible

        a.setLegs(6); // a.legs = 6
        a.setLegs(-6); // a.legs = 0
        a.show();
        System.out.println(a.getLegs());
        a.setAge(10);
        System.out.println(a.getAge());
    }
}

class Animal {
    String name;
    private int age;
    private int legs;

    // 对属性的设置
    public void setLegs(int num) {
        if (num >= 0 && num % 2 == 0) {
            legs = num;
        } else {
            legs = 0;
        }
    }

    // 对属性的获取
    public int getLegs() {
        return legs;
    }

    public void setAge(int num) {
        if (num > 0) {
            age = num;
        } else {
            age = 0;
        }
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("动物进食");
    }

    public void show() {
        System.out.println("name = " + name + ", age = " + age + ", legs = " + legs);
    }
}
