package com.dragontalker.java1;

/*
接口的使用
1. 接口使用上也满足多态性
2. 接口, 实际上就是定义了一种规范
3. 开发中, 体会面向接口编程
 */

public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();

        //1. 创建了接口的非匿名实现类的非匿名对象
        FlashDrive fd1 = new FlashDrive();
        com.transferData(fd1);

        //2. 创建了接口的非匿名的匿名对象
        com.transferData(new Printer());

    }
}

class Computer {
    public void transferData(USB usb) {
        usb.start();
        System.out.println("具体的传输数据的细节");
        usb.stop();
    }
}

interface USB {
    //常量: 定义了长、款、最大最小的传输速度
    void start();
    void stop();
}

class FlashDrive implements USB{

    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}

class Printer implements USB {

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}
