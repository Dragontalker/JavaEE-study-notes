package com.dragontalker.java3;

import com.dragontalker.java2.Employee;
import org.junit.Test;

import java.util.List;

/**
 * 测试Stream的终止操作
 */

public class StreamAPITest2 {

    //1 - 匹配与查找
    @Test
    public void test1() {
        List<Employee> employees = EmployeeData.getEmployees();

        //allMatch(Predicate p) - 检查是否匹配所有元素
        //练习1: 是否所有的员工的年龄都大于18
        boolean allMatch = employees.stream().allMatch(e -> e.getAge() > 18);
        System.out.println(allMatch);

        //anyMatch(Predicate p) - 检查是否至少匹配一个元素
        //练习2: 是否存在员工的工资大于10000
        boolean anyMatch = employees.stream().anyMatch(e -> e.getSalary() > 10000);
        System.out.println(anyMatch);

        //noneMatch(Predicate p) - 检查是否没有匹配的元素
        //练习3: 是否存在员工姓"雷"
        boolean noneMatch = employees.stream().noneMatch(e -> e.getName().startsWith("雷"));
        System.out.println(noneMatch);
    }
}
