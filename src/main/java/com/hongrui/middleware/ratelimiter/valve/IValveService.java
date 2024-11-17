package com.hongrui.middleware.ratelimiter.valve;

import com.hongrui.middleware.ratelimiter.annotation.DoRateLimiter;
import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.Method;

/**
 * @author hongrui
 * @description
 * @date 2024-11-17 12:38
 */
public interface IValveService {

    Object access(ProceedingJoinPoint jp, Method method, DoRateLimiter doRateLimiter, Object[] args) throws Throwable;

}
