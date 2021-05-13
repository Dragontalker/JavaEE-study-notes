package com.dragontalker.java2;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.register(-1001);
        System.out.println(s);
    }
}

class Student {
    int id;

    public void register(int id) throws RuntimeException{
        if (id > 0) {
            this.id = id;
        } else {
            //System.out.println("您输入的数据非法!");
            //手动抛出异常对象
            throw new RuntimeException();
        }
    }
}
