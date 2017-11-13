package com.smart.router.router;

import java.util.Map;

/**
 * Interceptor table mapping.
 * <p>
 * Created by Harry.Kong.
 */
public interface InterceptorTable {
    /**
     * Mapping between name and interceptor.
     *
     * @param map name -> interceptor.
     */
    void handle(Map<String, Class<? extends RouteInterceptor>> map);
}
