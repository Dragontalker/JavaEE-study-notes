package com.dragontalker.java;

import org.junit.Test;

import java.io.*;

/**
 * 处理流之一: 缓冲流的使用
 *
 * 1. 缓冲流:
 * BufferedInputStream
 * BufferedOutputStream
 * BufferedReader
 * BufferedWriter
 *
 * 2. 作用: 提供流的读取、写入的速度
 */

public class BufferedTest {

    /*
    实现非文本文件的复制
     */
    @Test
    public void BufferedStreamTest() {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            File srcFile = new File("myPicture.jpg");
            File destFile = new File("newPicture.jpg");

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[10];
            int len;
            while((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //要求: 先关闭外层的流, 再关闭内层的流
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
