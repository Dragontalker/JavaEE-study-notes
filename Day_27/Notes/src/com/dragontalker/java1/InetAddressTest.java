package com.dragontalker.java1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 一、网络编程又两个主要的问题:
 * 1. 如何准确的定位网络上一台或多态主机; 定位主机上的特定应用
 * 2. 找到主机后如何可靠高效的进行数据传输
 *
 * 二、网络编程中的两个要素:
 * 1. 对应问题一: IP和端口号
 * 2. 对应问题二: 提供网络通信协议:
 *      - TCP/IP参考模型
 *          1. 应用层
 *          2. 传输层
 *          3. 网络层
 *          4. 物理 + 数据链路层
 *
 * 三、通信要素一: IP和端口号
 *
 * 1. IP: 唯一的标识Internet上的计算机(通信实体)
 * 2. 在Java中使用InetAddress类代表IP
 * 3. IP分类: IPv4和IPv6; 万维网和局域网
 * 4. 域名: www.baidu.com  www.mi.com  www.sina.com
 * 5. 本地回路地址: 127.0.0.1 对应着: Localhost
 * 6. 如何实例化InetAddress: 两个方法: getByName(String host), getLocalHost()
 */

public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress inet1 = InetAddress.getByName("192.168.10.14");
            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.atguigu.com");
            System.out.println(inet2);

            InetAddress inet3 = InetAddress.getByName("127.0.0.1");
            System.out.println(inet3);

            //获取本地ip
            InetAddress inet4 = InetAddress.getLocalHost();
            System.out.println(inet4);

            //getHostName()
            System.out.println(inet2.getHostName());

            //getHostAddress()
            System.out.println(inet2.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
