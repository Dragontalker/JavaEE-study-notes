package com.dragontalker.java2;

/*
如何自定义异常类?
    1. 继承于现有的异常结构: RuntimeException, Exception
    2.
 */

public class MyException extends RuntimeException{

    static final long serialVersionUID = -3387516993124229948L;

    public MyException() {}

    public MyException(String msg) {
        super(msg);
    }
}
