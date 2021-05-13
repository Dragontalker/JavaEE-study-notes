package com.dragontalker.java2;

public class StudentTest {
    public static void main(String[] args) {
        try {
            Student s = new Student();
            s.register(-1001);
            System.out.println(s);
        } catch (RuntimeException e) {
            String message = e.getMessage();
            System.out.println("系统错误: " + message);
        }
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
            throw new RuntimeException("您输入的数据非法!");
        }
    }
}
