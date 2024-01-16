package ru.zoommax.bitcoin.annotation;

import java.lang.annotation.*;

/**
 * The interface No complete.
 */
@Documented
@Target(value = {ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NoComplete {
    /**
     * Value string.
     *
     * @return the string
     */
    String value() default "";
}
