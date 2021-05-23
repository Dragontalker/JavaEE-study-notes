package com.dragontalker.java1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现TCP的网络编程
 * 例题3: 从客户端发送文件给服务端,
 */

public class TCPTest3 {
    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        FileInputStream fis = null;
        try {
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9090);
            os = socket.getOutputStream();

            fis = new FileInputStream(new File("myPicture.jpg"));

            byte[] buffer = new byte[1024];
            int len;
            while((len = fis.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }

            //接受服务器段返回的数据, 并输出到控制台上
            InputStream is = socket.getInputStream();
            OutputStream outputStream =

            //
            byte[] buffer1 = new byte[20];
            int len1;
            while((len1 = is.read(buffer1)) != -1) {
                os.write(buffer, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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

    @Test
    public void server() {
        ServerSocket ss = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            ss = new ServerSocket(9090);

            Socket socket = ss.accept();

            is = socket.getInputStream();

            fos = new FileOutputStream(new File("newPicture1.jpg"));

            byte[] buffer = new byte[1024];
            int len;
            while((len = is.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }

            //服务器端给客户端反馈
            OutputStream os = socket.getOutputStream();
            os.write("您好, 照片已收到!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
