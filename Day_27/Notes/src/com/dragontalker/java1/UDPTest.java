package com.dragontalker.java1;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP协议的网络编程
 */

public class UDPTest {
    //发送端
    @Test
    public void sender() {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket();

            String str = "我是UDP方式发送的导弹!";
            byte[] data = str.getBytes();
            InetAddress inet = InetAddress.getLocalHost();
            DatagramPacket packet = new DatagramPacket(data, 0, data.length, inet, 9090);

            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }

    //接收端
    @Test
    public void receiver() {

    }

}
