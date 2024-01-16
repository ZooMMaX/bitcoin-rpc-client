package ru.zoommax.bitcoin.annotation;

import java.lang.annotation.*;

@Documented
@Target(value = {ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NoComplete {
    String value() default "";
}
