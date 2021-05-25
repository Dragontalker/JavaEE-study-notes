package com.dragontalker.java3;

import com.dragontalker.java2.Employee;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

/**
 * 测试Stream的中间操作
 */

public class StreamAPITest1 {
    //1-筛选与切片
    @Test
    public void test1() {
        List<Employee> list = EmployeeData.getEmployees();
        //filter(Predicate p) - 接收Lambda, 从流中排除某些元素
        Stream<Employee> stream = list.stream();
        //练习: 查询员工表中薪资大于7000的员工信息
        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);

        //limit(n) - 截断流, 使其元素不超过给定数量
        list.stream().limit(3).forEach(System.out::println);

        //skip(n) - 跳过元素, 返回一个扔掉了前n个元素的流
        //若元素不足n个, 则返回一个空流
        //与limit(n)互补
        list.stream().skip(3).forEach(System.out::println);

        //distinct() - 筛选, 通过
        list.add(new Employee(1010, "高圆圆", 16, 8000));
        list.add(new Employee(1010, "高圆圆", 16, 8000));
        list.add(new Employee(1010, "高圆圆", 16, 8000));
        list.add(new Employee(1010, "高圆圆", 16, 8000));
        System.out.println(list);

        list.stream().distinct().forEach(System.out::println);
    }
}
