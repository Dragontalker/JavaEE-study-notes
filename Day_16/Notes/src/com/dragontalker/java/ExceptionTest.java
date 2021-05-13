package com.dragontalker.java;

/*
一、异常的体系结构

java.lang.Throwable
    |---> java.lang.Error: 一般不编写针对性的代码处理
    |---> java.lang.Exception: 可以进行异常的处理
        |---> 编译时异常(checked)
            |---> IOException
                |---> FileNotFoundException
            |---> ClassNotFoundException
        |---> 运行时异常(unchecked)
            |---> NullPointerException
            |---> ArrayIndexOutOfBoundsException
            |---> ClassCastException
            |---> NumberFormatException
            |---> InputMismatchException
            |---> ArithmeticException

面试题: 常见的异常都有哪些？举例说明: 空指针、角标越界
 */

public class ExceptionTest {
}
