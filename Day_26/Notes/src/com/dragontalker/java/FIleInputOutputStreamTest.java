package com.dragontalker.java;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 测试FileInputStream和 FileOutputStream的使用
 *
 * 结论:
 * 1. 对于文本文件(.txt, .java, .c, .cpp), 使用字符流处理
 * 2. 对于非文本文件(.jpg, .mp3, .mp4, .avi, .doc, .ppt), 使用字节流处理
 */

public class FIleInputOutputStreamTest {

    //使用字节流FileInputStream处理文本文件, 可能出现乱码
    @Test
    public void testFIleInputStream() {
        FileInputStream fis = null;
        try {
            //1. 造文件
            File file = new File("hello.txt");

            //2. 造流
            fis = new FileInputStream(file);

            //3. 读数据
            byte[] buffer = new byte[5];
            int len; //记录每次读取的字节的个数
            while((len = fis.read(buffer)) != -1) {

                String str = new String(buffer, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭资源
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*
    实现对图片的一个复制
     */
    @Test
    public void testFileInputOutputStream() {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //
            File srcFile = new File("myPicture.jpg");
            File destFile= new File("copiedPicture.jpg");

            //
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //
            byte[] buffer = new byte[5];
            int len;
            while((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0 , len);
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
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //指定路径下文件的复制
    public void copyFile(String srcPath, String destPath) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //
            File srcFile = new File(srcPath);
            File destFile= new File(destPath);

            //
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //
            byte[] buffer = new byte[5];
            int len;
            while((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0 , len);
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
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testCopyFile() {
        long start = System.currentTimeMillis();

        copyFile("myPicture.jpg", "newPicture.jpg");

        long end = System.currentTimeMillis();

        System.out.println("复制操作花费的时间为: " + (end - start) + "ms");
    }
}
