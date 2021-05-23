package com.dragontalker.java1;

import org.junit.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 实现TCP的网络编程
 * 例题2: 客户端发送文件给服务端, 服务端将文件保存在本地
 */
public class TCPTest2 {

    @Test
    public void client() throws IOException {
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9090);

    }

    @Test
    public void server() {

    }
}
