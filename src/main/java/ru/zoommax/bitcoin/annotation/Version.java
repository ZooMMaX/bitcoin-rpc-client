package ru.zoommax.bitcoin.annotation;

import java.lang.annotation.*;

/**
 * The interface Version.
 */
@Documented
@Target(value = {ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Version {
    /**
     * Since string.
     *
     * @return the string
     */
    String since() default "";

    /**
     * Warn string.
     *
     * @return the string
     */
    String warn() default "";

    /**
     * End string.
     *
     * @return the string
     */
    String end() default "";
}
