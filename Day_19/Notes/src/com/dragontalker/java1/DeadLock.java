package com.dragontalker.java1;

//死锁的演示

class A {
    public synchronized void foo(B b) {
        System.out.println("当前线程名: " + Thread.currentThread().getName() +
                " 进入了A实例的foo方法");
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("当前线程名: " + Thread.currentThread().getName() +
                " 企图调用B实例的last方法");
    }

    public synchronized void last() {
        System.out.println("进入了A类的last方法内部");
    }
}


public class DeadLock {
}
