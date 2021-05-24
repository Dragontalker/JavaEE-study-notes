package com.dragontalker.java1;

public class Person extends Creature<String> implements Comparable<String>{
    private String name;
    private int age;

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
