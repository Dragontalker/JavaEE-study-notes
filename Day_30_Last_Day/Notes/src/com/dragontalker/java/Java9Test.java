package com.dragontalker.java;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Java9Test {

    //java9特性五: 钻石操作符的升级
    @Test
    public void test1() {
        //jdk8要求<>不能为空
        //钻石操作符与匿名内部类在java 8中不能共存, 在java9可以
        Comparator<Object> com = new Comparator<>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        //类型推断: jdk7开始就有了
        ArrayList<String> list = new ArrayList<>();
    }

    //java9 特性六: try操作的升级
    public static void main(String[] args) {
        //java8之前的资源关闭的操作
//        InputStreamReader reader = new InputStreamReader(System.in);
//        char[] cbuf = new char[20];
//        int len;
//        try {
//            if ((len = reader.read(cbuf)) != -1) {
//                String str = new String(cbuf, 0, len);
//                System.out.println(str);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        //java 8中资源关闭操作
        //要求执行后必须关闭的所有资源必须在try中初始化
//        try(InputStreamReader reader = new InputStreamReader(System.in)) {
//            char[] cbuf = new char[20];
//            int len;
//            if ((len = reader.read(cbuf)) != -1) {
//                String str = new String(cbuf, 0, len);
//                System.out.println(str);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //java 9中资源关闭操作
        //需要自动关闭的资源的实例化可以放在try的一对小括号外
        InputStreamReader reader = new InputStreamReader(System.in);
        try(reader) {
            char[] cbuf = new char[20];
            int len;
            if ((len = reader.read(cbuf)) != -1) {
                String str = new String(cbuf, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
