package com.dragontalker.java1;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL网络编程
 * 1. URL: 统一资源定位符, 对应着互联网的某一资源地址
 * 2. 格式:
 *  http(协议)://localhost(主机名):8080(端口号)/
 *      examples/beauty.jpg(资源地址)?username=Xxx(参数列表)
 */

public class URLTest {
    public static void main(String[] args) {
        URL url;
        try {
            url = new URL("http://localhost:8080/examples/beauty.jpg");
            url.getPort();
            url.getProtocol();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
