package com.dragontalker.java3;

import com.dragontalker.java2.Employee;
import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

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

        //findFirst - 返回第一个元素
        Optional<Employee> firstEmployee = employees.stream().findFirst();
        System.out.println(firstEmployee);

        //findAny - 返回当前流中的任意元素
        Optional<Employee> anyEmployee = employees.parallelStream().findAny();
        System.out.println(anyEmployee);
    }

    @Test
    public void test2() {
        List<Employee> employees = EmployeeData.getEmployees();

        //count - 返回流中元素的总个数
        long count = employees.stream().filter(e -> e.getSalary() > 5000).count();
        System.out.println(count);

        //max(Comparator com) - 返回流中最大值
        //练习1: 返回最高的工资
        Optional<Double> maxSalary = employees.stream().map(Employee::getSalary).max(Double::compare);
        System.out.println(maxSalary);

        //min(Comparator com) - 返回流中最小值
        //练习2: 返回最低工资的员工
        Optional<Employee> minSalaryEmployee = employees.stream().min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(minSalaryEmployee);
    }
}
