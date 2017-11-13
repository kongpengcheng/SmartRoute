package com.smart.router.router.matcher;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;

import com.smart.router.router.RouteRequest;

/**
 * Created by Harry.Kong.
 * Time 2017/11/8.
 * Description:This matcher will generate an intent with an {@link android.content.Intent#ACTION_VIEW} action
 */
public class BrowserMatcher extends AbsImplicitMatcher {
    public BrowserMatcher(int priority) {
        super(priority);
    }

    @Override
    public boolean match(Context context, Uri uri, @Nullable String route, RouteRequest routeRequest) {
        return (uri.toString().toLowerCase().startsWith("http://")
                || uri.toString().toLowerCase().startsWith("https://"));
    }
}
