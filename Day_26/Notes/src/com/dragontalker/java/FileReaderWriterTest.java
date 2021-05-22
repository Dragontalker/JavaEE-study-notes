package com.dragontalker.java;

import org.junit.Test;

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

    @Test
    public void testFileReader() {

    }
}
