package com.winter.androidtestlearn.click;

import androidx.annotation.IdRes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * create by 高 (｡◕‿◕｡) 磊
 * 2021/4/27
 * desc :
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Click {
    @IdRes int[] value();
}
