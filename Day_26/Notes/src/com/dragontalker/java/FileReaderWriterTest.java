package com.dragontalker.java;

import org.junit.Test;

import java.io.File;

/**
 * 一、流的分类:
 * 1. 操作数据单位: 字节流, 字符流
 * 2. 数据的流向: 输入流, 输出流
 * 3. 流的角色: 节点流, 处理流
 *
 * 二、流的体系结构
 * 抽象基类             节点流(或文件流)           缓冲流(处理流的一种)
 * InputStream          FileInputStream         BufferedInputStream
 * OutputStream         FileOutputStream        BufferedOutputStream
 * Reader               FileReader              BufferedReader
 * Writer               FileWriter              BufferedWriter
 */

public class FileReaderWriterTest {
    public static void main(String[] args) {
        File file = new File("hello.txt"); // 相较于当前工程
        System.out.println(file.getAbsoluteFile());

        File file1 = new File("Notes\\hello.txt");
        System.out.println(file1.getAbsolutePath());
    }

    @Test
    public void testFileReader() {
        File file = new File("hello.txt"); //相较于当前Module下
    }
}
