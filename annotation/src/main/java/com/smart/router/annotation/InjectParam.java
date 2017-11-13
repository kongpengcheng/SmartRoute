package com.smart.router.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Harry.Kong.
 * Time 2017/11/8.
 * Description:参数
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface InjectParam {
    /**
     * Map param field with the specify key in bundle.
     */
    String key() default "";
}
