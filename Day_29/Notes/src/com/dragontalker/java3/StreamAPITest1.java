package com.dragontalker.java3;

import com.dragontalker.java2.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
        //练习1: 查询员工表中薪资大于7000的员工信息
        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);

        //limit(n) - 截断流, 使其元素不超过给定数量
        list.stream().limit(3).forEach(System.out::println);

        //skip(n) - 跳过元素, 返回一个扔掉了前n个元素的流
        //若元素不足n个, 则返回一个空流
        //与limit(n)互补
        list.stream().skip(3).forEach(System.out::println);

        //distinct() - 筛选, 通过流所生成元素的hashCode()和equals()去除重复元素
        list.add(new Employee(1010, "高圆圆", 16, 8000));
        list.add(new Employee(1010, "高圆圆", 16, 8000));
        list.add(new Employee(1010, "高圆圆", 16, 8000));
        list.add(new Employee(1010, "高圆圆", 16, 8000));
        System.out.println(list);

        list.stream().distinct().forEach(System.out::println);

        //练习2:
        //list.stream().flatMap(StreamAPITest1::fromStringToStream);
    }

    //映射
    @Test
    public void test2() {
        //map(Function f) - 接收一个函数作为参数, 将元素转换成其他形式或提取信息
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        //练习: 获取员工姓名长度大于3的员工的姓名
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream()
                .map(Employee::getName)
                .filter(name -> name.length() >3)
                .forEach(System.out::println);
    }

    //flatMap(Function f)
    //接收一个函数作为参数
    //将流中的每个值都换成另一个流
    //然后把所有流连接成一个流
    @Test
    public void test3() {
        ArrayList list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        //list1.add(list2);
        list1.addAll(list2);
        System.out.println(list1);
    }

    //将字符串中的多个字符构成的集合转换为对应的Stream的实例
    public static Stream<Character> fromStringToStream(String str) {
        ArrayList<Character> list = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();
    }

    //3 - 排序
    @Test
    public void test4() {
        //sorted() - 自然排序
        List<Integer> list = Arrays.asList(12, 43, 65, 34, 87, 0, -98, 7);
        list.stream().sorted().forEach(System.out::println);

        //抛异常, 原因: Employee没有实现Comparable接口
//        List<Employee> employees = EmployeeData.getEmployees();
//        employees.stream().sorted().forEach(System.out::println);

        //sorted(Comparator com) - 定制排序
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().sorted((e1, e2) -> {
            int ageDiff = Integer.compare(e1.getAge(), e2.getAge());
            if (ageDiff != 0) {
                return ageDiff;
            } else {
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        }).forEach(System.out::println);
    }
}
