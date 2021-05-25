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
        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);
    }
}
