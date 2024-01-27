package ru.zoommax.bitcoin.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The interface No complete.
 */
@Documented
@Target(value = { ElementType.METHOD, ElementType.TYPE, ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface NoComplete {
	/**
	 * Value string.
	 *
	 * @return the string
	 */
	String value() default "";
}
