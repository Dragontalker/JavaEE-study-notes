package com.dragontalker.java4;

import org.junit.Test;

import java.util.Optional;

public class OptionalTest {

    @Test
    public void test1() {
        Girl girl = new Girl();
        girl = null;
        //of(T t): 保证t是非空的
        Optional<Girl> optionalGirl = Optional.of(girl);
        //System.out.println(optionalGirl);
    }

    @Test
    public void test2() {
        Girl girl = new Girl();
        girl = null;
        //ofNullable(T t): t可以为null
        Optional<Girl> optionalGirl = Optional.ofNullable(girl);
        System.out.println(optionalGirl);
    }
}
