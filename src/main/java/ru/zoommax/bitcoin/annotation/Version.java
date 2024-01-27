package ru.zoommax.bitcoin.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The interface Version.
 */
@Documented
@Target(value = { ElementType.METHOD, ElementType.TYPE, ElementType.FIELD } )
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
