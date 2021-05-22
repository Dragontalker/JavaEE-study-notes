package com.dragontalker.java;

import org.junit.Test;

/**
 * 其他流的使用
 * 1. 标准的输入、输出流
 * 2. 打印流
 * 3. 数据流
 */

public class OtherStreamTest {
    /*
    1. 标准的输入、输出流
        1.1 System.in: 标准的输入流, 默认从键盘输入
            System.out: 标准的输出流, 默认从控制台输出

        1.2 System类的setIn(InputStream is)/setOut(PrintStream ps)方式重新指定输入和输入的流

        1.3
            - 从键盘输入字符串
            - 要求将读取到的整行字符串转成大写输入
            - 然后继续进行输入操作
            - 直至当输入"e"或者"exit"时, 退出程序
     */
    @Test
    public void test1() {

    }

}
