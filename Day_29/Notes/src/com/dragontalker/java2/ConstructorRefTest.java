package com.dragontalker.java2;

import org.junit.Test;

import java.util.function.Supplier;

/**
 * 构造器引用
 */

public class ConstructorRefTest {

    //构造器引用
    //Supplier中的T get()
    //Employee的空参构造器: Employee()
    @Test
    public void test1() {
        Supplier<Employee> sup1 = () -> new Employee();

        System.out.println("************");

        Supplier<Employee> sup2 = Employee::new;
    }
}
