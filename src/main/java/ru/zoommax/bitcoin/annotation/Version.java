package ru.zoommax.bitcoin.annotation;

import java.lang.annotation.*;

@Documented
@Target(value = {ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Version {
    String since() default "";

    String warn() default "";

    String end() default "";
}
