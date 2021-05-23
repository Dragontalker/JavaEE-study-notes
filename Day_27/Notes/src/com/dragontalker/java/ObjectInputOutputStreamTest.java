package com.dragontalker.java;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流的使用
 * 1. ObjectInputStream和 ObjectOutputStream
 *
 * 2. 作用: 用于存储和读取基本数据类型数据或对象的处理流
 */

public class ObjectInputOutputStreamTest {
    /*
    序列化过程: 将内存中的java对象保存到磁盘中或通过网络传输出去
        - 使用ObjectOutputStream实现
     */
    @Test
    public void testObjectOutputStream() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));

            oos.writeObject(new String("我爱北京天安门"));

            oos.flush(); //刷新操作
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
