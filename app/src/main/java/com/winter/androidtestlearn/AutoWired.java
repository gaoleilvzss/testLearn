package com.winter.androidtestlearn;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * create by 高 (｡◕‿◕｡) 磊
 * 2021/4/26
 * desc :
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoWired {
    String value() default "";

}
