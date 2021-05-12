package com.dragontalker.interview;

public class Something2 {
    public static void main(String[] args) {
        Other o = new Other();
        new Something2.addOne(o);
    }

    public void addOne(final Other o) {
        //o = new Other();
        o.i++; //o的地址不能变, 但是里面的属性可以变
    }
}

class Other {
    public int i;
}