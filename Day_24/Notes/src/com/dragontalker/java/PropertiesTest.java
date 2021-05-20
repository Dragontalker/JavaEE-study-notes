package com.dragontalker.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesTest {

    //Properties:  常用来处理配置文件, key和value都是String类型
    public static void main(String[] args) throws FileNotFoundException {
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("jdbc.properties");
        props.load();
    }
}
