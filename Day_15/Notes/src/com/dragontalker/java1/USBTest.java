package com.dragontalker.java1;

/*
接口的使用
 */

public class USBTest {
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
