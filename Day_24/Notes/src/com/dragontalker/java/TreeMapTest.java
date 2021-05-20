package com.dragontalker.java;

import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {
    //向TreeMap中添加key-value, 要求key必须是由同一个类创建的对象
    //因为要按照key进行排序: 自然排序、定制排序
    @Test
    public void test1() {
        TreeMap map = new TreeMap();
        map.put("MM", "高圆圆");
        map.put("JJ", "林志玲");
    }
}
