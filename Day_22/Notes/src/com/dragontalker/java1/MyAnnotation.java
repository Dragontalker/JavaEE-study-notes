package com.dragontalker.java1;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.PARAMETER})
public @interface MyAnnotation {
    String value() default "hello";
}
