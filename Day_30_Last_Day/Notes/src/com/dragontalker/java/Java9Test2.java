package com.dragontalker.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Java9Test2 {

    //java9新特性十: Stream API的加强
    @Test
    public void test1() {
        //takeWhile(): 返回从开头开始的按指定规则尽量多的元素
        List<Integer> list = Arrays.asList(23, 43, 45, 55, 61, 54, 32, 2, 45, 89, 7);
        //list.stream().takeWhile(x -> x < 60).forEach(System.out::println);

        //dropWhile(): 返回剩余的元素
        list.stream().dropWhile(x -> x < 60).forEach(System.out::println);
    }

    @Test
    public void test2() {
        //java8中, of()参数中的多个元素, 可以包含null值
        Stream<Integer> stream1 = Stream.of(1, 2, 3, null);
        stream1.forEach(System.out::println);

        //of()不能只存储单个null, 会出现空指针异常
//        Stream<Object> stream2 = Stream.of(null);
//        stream2.forEach(System.out::println);

        //但只有一个元素时, ofNullable可有效防止空指针异常
        Stream<Object> stream3 = Stream.ofNullable(null);
        long count = stream3.count();
        System.out.println(count);
    }

    @Test
    public void test3() {
        Stream.iterate(0, x -> x +1).limit(10).forEach(System.out::println);

        //java9中新增的重载方法
        Stream.iterate(0, x -> x < 100, x-> x + 1).forEach(System.out::println);
    }

    //java9新特性十一: Optional提供了新的方法stream()
    @Test
    public void test4() {
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jerry");
        list.add("Tim");

        Optional<List<String>> optional = Optional.ofNullable(list);
        Stream<List<String>> stream = optional.stream();
        long count = stream.count();
        System.out.println(count); //唯一的元素就是list


    }

}
