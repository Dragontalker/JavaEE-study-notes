package com.dragontalker.java1;

import java.lang.annotation.*;
import java.lang.reflect.Method;

import static java.lang.annotation.ElementType.*;

@Inherited
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
public @interface MyAnnotation {
    String value() default "hello";
}
