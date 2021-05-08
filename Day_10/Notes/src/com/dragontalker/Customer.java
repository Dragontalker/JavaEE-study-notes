package com.dragontalker;

/*
JavaBean
 */

public class Customer {
    private String name;
    private int id;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}
