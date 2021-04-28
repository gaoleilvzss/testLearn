package com.winter.lib_java_lean.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * create by 高 (｡◕‿◕｡) 磊
 * 2021/4/26
 * desc :
 */
//元注解 注解上的注解
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
//SOURCE APT技术 注解处理器 自动生成代码
//CLASS 字节码增强 aspectj  热修复
//RUNTIME
public @interface test {
    String value();
}
