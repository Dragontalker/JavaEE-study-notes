package com.dragontalker.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理的举例
 */

interface Human {

    String getBelief();
    void eat(String food);
}

//被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "I believe I can fly!";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}

/*
要想实现动态代理, 需要解决的问题?
 - 问题1: 如何根据加载到内存中的被代理类, 动态的创建一个代理类及其对象?
 - 问题2: 当通过代理类的对象调用方法时, 如何动态的去调用被代理类中的同名方法?
 */

class ProxyFactory {
    //obj: 被代理类的对象
    //调用此方法, 返回一个代理类的对象, 解决问题1
    public static Object getProxyInstance(Object obj) {

        MyInvocationHandler handler = new MyInvocationHandler();
        return Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                handler
        );
    }
}

class MyInvocationHandler implements InvocationHandler {

    private Object obj; //赋值时, 也需要被代理类的对象进行赋值

    public void bind(Object obj) {
        this.obj = obj;
    }

    //当我们通过代理类的对象, 调用方法a时, 就会自动调用如下的方法: invoke()
    //将被代理类要执行的方法a的功能就声明在invoke()中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}

public class ProxyTest {
}
