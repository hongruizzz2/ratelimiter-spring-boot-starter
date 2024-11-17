package com.hongrui.middleware.ratelimiter;

import com.google.common.util.concurrent.RateLimiter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hongrui
 * @description
 * @date 2024-11-17 12:31
 */
public class Constants {

    public static Map<String, RateLimiter> rateLimiterMap = Collections.synchronizedMap(new HashMap<String, RateLimiter>());

}
