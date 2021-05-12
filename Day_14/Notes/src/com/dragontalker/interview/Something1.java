package com.dragontalker.interview;

public class Something1 {
    public int addOne(final int x) {
        //return ++x; //Error: cannot assign value to a final variable
        return x + 1; //This is OK.
    }
}
