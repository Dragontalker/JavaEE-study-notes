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
    }
}
