package com.smart.router.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Harry.Kong.
 * Time 2017/11/8.
 * Description:路由
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface Route {
    /**
     * Route path.
     */
    String[] value();

    /**
     * The interceptors' name.
     */
    String[] interceptors() default {};
}
