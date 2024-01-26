package ru.zoommax.bitcoin.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The interface Error body.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ErrorBody {
    /**
     * Body string.
     *
     * @return the string
     */
    String body() default "";
}
