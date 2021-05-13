package com.dragontalker.java2;

import com.dragontalker.exer3.ComparableCircle;

public class InnerClassTest1 {

    //开发中很少见
    public void method() {
        class AA {}
    }

    //返回了一个实现了Comparable接口类的对象
    public Comparable getComparable() {

        //创建了一个实现了Comparable接口类的: 局部内部类
        class MyComparable implements Comparable {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyComparable();
    }
}
