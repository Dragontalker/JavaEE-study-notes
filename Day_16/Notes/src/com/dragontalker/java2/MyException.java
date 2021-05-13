package com.dragontalker.java2;

/*
如何自定义异常类?
    1. 继承于现有的异常结构: RuntimeException, Exception
    2. 提供一个全局常量: serialVersionUID
    3. 提供重载的构造器
 */

public class MyException extends RuntimeException{

    static final long serialVersionUID = -338751699312L;

    public MyException() {}

    public MyException(String msg) {
        super(msg);
    }
}
