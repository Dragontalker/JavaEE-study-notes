package com.dragontalker.java8;

interface Filial {
    default void help() {
        System.out.println("老妈, 我来救你了!");
    }
}

interface Spoony {
    default void help() {
        System.out.println("媳妇, 别怕! 我来了~");
    }
}

class Father {
    public void help() {
        System.out.println("儿子, 救我媳妇!");
    }
}

public class Man extends Father implements Filial, Spoony{

    @Override
    public void help() {
        System.out.println("我该怎么办呢?");
        Filial.super.help();
        Spoony.super.help();
    }
}
