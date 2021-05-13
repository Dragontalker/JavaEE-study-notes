package com.dragontalker.java;

/*
一、异常的处理: 抓抛模型

过程一: "抛": 程序在正常执行的过程中, 一旦出现异常, 就会在异常代码处生成一个对应异常类的对象
    并将此对象抛出. 一旦抛出对象以后, 其后的代码就不再执行.

过程二: "抓": 可以理解为异常的处理方式:
    - 1. try-catch-finally
    - 2. throws

二、try-catch-finally的使用

try {
    //可能出现异常的代码
} catch(异常类型1 变量名1) {
    //处理异常的方式1
} catch(异常类型2 变量名2) {
    //处理异常的方式2
} catch(异常类型3 变量名3) {
    //处理异常的方式3
}
...
finally {
    //一定会执行的代码
}

说明:
1. finally是可选的
2. 使用try将可能出现异常代码包装起来, 在执行过程中, 一旦出现异常, 就会生成一个异常类的对象
    - 根据对象的类型, 去catch中机型匹配
3. 一旦try中的异常对象匹配到某一个catch时, 就进入catch中进行异常的处理.
    - 一旦处理完成, 就跳出当前的try-catch结构(在没有写finally的情况下), 继续执行其后的代码
4. catch中的异常类型如果没有子父类关系, 则谁声明在上, 谁声明在下无所谓.
   catch中的异常类性如果满足子父类的关系, 则子类一定要声明在父类上面, 否则, 报错
 */

import org.junit.Test;

public class ExceptionTest1 {

    @Test
    public void test1() {
        String str = "123";
        str = "abc";

        try {
            int num = Integer.parseInt(str);
            System.out.println("Hello----1");
        } catch (NumberFormatException e) {
            //System.out.println("出现数值转化异常了, 不要着急....");
            //String getMessage():
            //System.out.println(e.getMessage());
            //printStackTrace():
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("出现空指针异常了, 不要着急....");
        } catch (Exception e) {
            System.out.println("出现异常了, 不要着急....");
        }

        System.out.println("Hello----2");
    }
}
