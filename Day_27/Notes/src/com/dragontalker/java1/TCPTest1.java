package com.dragontalker.java1;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

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
            //1. 创建Socket对象, 指明服务器端的ip和端口号
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inet, 8899);
            //2. 获取一个输出流, 用于输出数据
            os = socket.getOutputStream();
            //3. 写出数据的操作
            os.write("您好, 我是客户端MM".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 资源的关闭
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
        ServerSocket ss = null;
        InputStream is = null;
        try {
            //1. 创建服务器端的ServerSocket, 指明自己的端口号
            ss = new ServerSocket(8899);
            //2. 调用accept()表示接收来自于客户端的socket
            Socket socket = ss.accept();
            //3. 获取输入流
            is = socket.getInputStream();
            //4. 读取输入流中的数据
            byte[] buffer = new byte[1024];
            int len;
            while((len = is.read(buffer)) != -1) {
                String str = new String(buffer, 0, len);
                System.out.print(str);
            }
            System.out.println("收到了来自于: " + socket.getInetAddress().getHostName());
        } catch (IOException e) {
            //5. 资源的关闭
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ss != null) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
