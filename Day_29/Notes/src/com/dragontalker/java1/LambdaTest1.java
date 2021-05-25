package com.dragontalker.java1;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Lambda表达式的使用
 *
 * 1. 举例: (o1, o2) -> Integer.compare(o1, o2);
 *
 * 2. 格式:
 *  -> : Lambda操作符 或 箭头操作符
 *  ->的左边: Lambda形参列表(其实就是接口中的抽象方法的形参列表)
 *  ->的右边: Lambda体(其实就是重写的抽象方法的方法体)
 *
 * 3. Lambda表达式的使用: (分为6种情况)
 *
 *  总结:
 *    -> 左边: Lambda形参列表的参数类型, 如果只有一个参数可以省略小括号
 *    -> 右边: Lambda体应该使用一对{}包裹, 如果只有一条执行语句可以省略{}和return
 *
 * 4. Lambda表达式的本质: 作为函数式接口的实例
 *
 * 5. 如果一个接口中, 只声明了一个抽象方法, 那么这个接口称为函数式接口
 */

public class LambdaTest1 {
    //语法格式1: 无参, 无返回值
    @Test
    public void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北京天安门");
            }
        };
        r1.run();

        //使用Lambda表达式重写
        //作为Runnable接口的实例
        Runnable r2 = () -> System.out.println("我爱北京故宫");
        r2.run();
    }

    //语法格式二: Lambda需要一个参数, 但是没有返回值
    @Test
    public void test2() {
        Consumer<String> con = new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别时什么?");

        System.out.println("*****************");

        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("一个是听的人当真了, 一个是说的人当真了");
    }

    //语法格式3: 数据类型可以省略, 因为可由编译器推断得出
    //称为"类型推断"
    @Test
    public void test3() {
        Consumer<String> con = new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别时什么?");

        System.out.println("*****************");

        Consumer<String> con1 = (s) -> {
            System.out.println(s);
        };
        con1.accept("一个是听的人当真了, 一个是说的人当真了");
    }

    //语法格式4: Lambda或需要一个参数时, 参数的小括号也可以省略
    @Test
    public void test4() {
        Consumer<String> con = new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("谎言和誓言的区别时什么?");

        System.out.println("*****************");

        Consumer<String> con1 = s -> {
            System.out.println(s);
        };
        con1.accept("一个是听的人当真了, 一个是说的人当真了");
    }

    //语法格式5:
    //1. Lambda需要两个或以上的参数
    //2. 多条执行语句
    //3. 并且有返回值
    @Test
    public void test5() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };

        com1.compare(12, 21);

        System.out.println("*****************");

        Comparator<Integer> com2 = (o1, o2) -> {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
        };

        System.out.println(com2.compare(12, 6));
    }

    //语法格式六: 当Lambda体只有一条语句时, return与大括号可以省略
    @Test
    public void test6() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        com1.compare(12, 21);

        System.out.println("*****************");

        Comparator<Integer> com2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com2.compare(12, 6));
    }

    @Test
    public void test7() {
        Consumer<String> con1 = (String s) -> {
            System.out.println(s);
        };
        con1.accept("一个是听的人当真了, 一个是说的人当真了");

        System.out.println("*****************");

        Consumer<String> con2 = System.out::println;
        con2.accept("一个是听的人当真了, 一个是说的人当真了");
    }
}
