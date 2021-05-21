package com.dragontalker.exer;

import org.junit.Test;
import java.util.TreeSet;

public class EmployeeTest {

    //问题一: 使用自然排序
    @Test
    public void test1() {
        //jdk7.0以后的新特性: 类型推断
        TreeSet<Employee> set = new TreeSet<>();

        Employee e1 = new Employee("liudehua", 55, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("zhangxueyou", 43, new MyDate(1987, 5, 4));
        Employee e3 = new Employee("guofucheng", 44, new MyDate(1987, 5, 9));
        Employee e4 = new Employee("liming", 51, new MyDate(1954, 8, 12));
        Employee e5 = new Employee("liangchaowei", 21, new MyDate(1978, 12, 4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        for (Employee employee : set) {
            System.out.println(employee);
        }
    }

    //问题二: 按生日日期的先后排序
    @Test
    public void test2() {
        TreeSet<Employee> set = new TreeSet<>((e1, e2) -> {
            MyDate b1 = e1.getBirthday();
            MyDate b2 = e2.getBirthday();
            return b1.compareTo(b2);
        });

        Employee e1 = new Employee("liudehua", 55, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("zhangxueyou", 43, new MyDate(1987, 5, 4));
        Employee e3 = new Employee("guofucheng", 44, new MyDate(1987, 5, 9));
        Employee e4 = new Employee("liming", 51, new MyDate(1954, 8, 12));
        Employee e5 = new Employee("liangchaowei", 21, new MyDate(1978, 12, 4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        for (Employee employee : set) {
            System.out.println(employee);
        }
    }
}
