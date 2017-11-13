package com.smart.router.router;

import android.net.Uri;


import com.smart.router.router.matcher.AbsMatcher;
import com.smart.router.router.util.RLog;

import java.util.ArrayList;
import java.util.List;

/**
 * Entry class.
 * <p>
 * Created by Harry.Kong.
 */
public class Router {
    /**
     * You can get the raw uri in target page by call <code>intent.getStringExtra(Router.RAW_URI)</code>.
     */
    public static final String RAW_URI = "raw_uri";

    private static List<RouteInterceptor> sGlobalInterceptors = new ArrayList<>();


    public static void initialize(Configuration configuration) {
        RLog.showLog(configuration.debuggable);
        AptHub.registerModules(configuration.modules);
    }

    public static IRouter build(String path) {
        return build(path == null ? null : Uri.parse(path));
    }

    public static IRouter build(Uri uri) {
        return RealRouter.getInstance().build(uri);
    }

    /**
     * Use {@link #handleRouteTable(RouteTable)} instead.
     * <p>
     * This method will be <strong>removed</strong> in a future release.
     */
    @Deprecated
    public static void addRouteTable(RouteTable routeTable) {
        handleRouteTable(routeTable);
    }

    /**
     * Custom route table.
     */
    public static void handleRouteTable(RouteTable routeTable) {
        RealRouter.getInstance().handleRouteTable(routeTable);
    }

    /**
     * Custom interceptor table.
     */
    public static void handleInterceptorTable(InterceptorTable interceptorTable) {
        RealRouter.getInstance().handleInterceptorTable(interceptorTable);
    }

    /**
     * Custom targets' interceptors.
     */
    public static void handleTargetInterceptors(TargetInterceptors targetInterceptors) {
        RealRouter.getInstance().handleTargetInterceptors(targetInterceptors);
    }

    /**
     * Auto inject params from bundle.
     *
     * @param obj Instance of Activity or Fragment.
     */
    public static void injectParams(Object obj) {
        RealRouter.getInstance().injectParams(obj);
    }

    /**
     * Global interceptor.
     */
    public static void addGlobalInterceptor(RouteInterceptor routeInterceptor) {
        sGlobalInterceptors.add(routeInterceptor);
    }

    public static List<RouteInterceptor> getGlobalInterceptors() {
        return sGlobalInterceptors;
    }

    /**
     * Register your own matcher.
     *
     */
    public static void registerMatcher(AbsMatcher matcher) {
        MatcherRegistry.register(matcher);
    }

    public static void clearMatcher() {
        MatcherRegistry.clear();
    }
}
