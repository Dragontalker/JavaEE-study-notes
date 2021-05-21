package com.dragontalker.java1;

import org.junit.Test;

import java.util.List;

public class DAOTest {

    @Test
    public void test1() {
        CustomerDAO dao1 = new CustomerDAO();
        dao1.add(new Customer());
        List<Customer> list1 = dao1.getForList(10);

        StudentDAO dao2 = new StudentDAO();
        dao2.add(new Student());
        List<Student> list2 = dao2.getForList(10);
    }
}
