package com.hongrui.middleware.ratelimiter.annotation;

import jdk.nashorn.internal.ir.annotations.Reference;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author hongrui
 * @description
 * @date 2024-11-17 12:31
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DoRateLimiter {

    double permitsPerSecond() default 0D; // 限流许可量
    String returnJson() default ""; // 失败结果 JSON

}
