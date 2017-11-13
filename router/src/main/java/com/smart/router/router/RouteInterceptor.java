package com.smart.router.router;

import android.content.Context;

/**
 * Interceptor before route.
 * <p>
 * Created by Harry.Kong.
 */
public interface RouteInterceptor {
    /**
     * @param context      Context
     * @param routeRequest RouteRequest
     * @return True if you want to intercept this route, false otherwise.
     */
    boolean intercept(Context context, RouteRequest routeRequest);
}
