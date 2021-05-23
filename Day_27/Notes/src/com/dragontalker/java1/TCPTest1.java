package com.dragontalker.java1;

import org.junit.Test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 实现TCP的网络编程
 *
 * 例子1: 客户端发送信息给服务端, 服务端将信息展现在控制台上
 */

public class TCPTest1 {
    //客户端
    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet, 8899);

            os = socket.getOutputStream();
            os.write("您好, 我是客户端MM".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //服务端
    @Test
    public void server() {

    }
}
