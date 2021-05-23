package com.dragontalker.java1;

import org.junit.Test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP协议的网络编程
 */

public class UDPTest {
    //发送端
    @Test
    public void sender() {
        DatagramSocket socket = new DatagramSocket();

        String str = "我是UDP方式发送的导弹!";
        byte[] data = str.getBytes();
        DatagramPacket packet = new DatagramPacket(data, 0, data.length);
    }

    //接收端
    @Test
    public void receiver() {

    }

}
