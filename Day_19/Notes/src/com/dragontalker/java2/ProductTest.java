package com.dragontalker.java2;

/*
线程通信的应用: 经典例题: Producer/Consumer问题

分析:
1. 是否是多线程问题? 是, Producer线程、Consumer线程
2. 是否有共享数据? 是, Clerk(Or Product)
3. 如何解决线程的安全问题? 同步机制, 有三种方法
4. 是否涉及到线程的通信? 是
 */

class Clerk {
    private int productCount = 0;

    //生产产品
    public void produceProduct() {
        if (productCount < 20) {
            productCount++;
            System.out.println(Thread.currentThread().getName() + ": 开始生产第" +
                    productCount + "个产品");
        } else {
            //wait();
        }
    }

    //生产产品
    public void consumeProduct() {
    }
}

class Producer extends Thread{

    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }
    
    @Override
    public void run() {
        System.out.println(getName() + ": 开始生产产品....");
        while(true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.produceProduct();
        }
    }
}

class Consumer extends Thread{

    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + ": 开始消费产品....");
        while(true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.consumeProduct();
        }
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("Producer#1");

        Consumer c1 = new Consumer(clerk);
        c1.setName("Consumer#1");

    }
}
