package com.dragontalker.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    @Test
    public void testListRemove() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list); //[1, 2]
    }

    public static void updateList(List list) {
        list.remove(2); //注意这里的int是index而不是Integer类
    }
}
