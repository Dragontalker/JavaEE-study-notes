package com.dragontalker.exer;

import org.junit.Test;

public class StringDemo1 {
    /*
    获取一个字符串在另一个字符串中出现的次数
     */

    //获取subStr在mainStr中出现的次数
    public int getCount(String mainStr, String subStr) {
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int count = 0;

        if (mainLength >= subLength) {

        } else {
            return count;
        }
        return count;
    }

    @Test
    public void testGetCount() {
        String mainStr = "abkkcadkabkebfkabkskab";
        String subStr = "ab";

    }
}
