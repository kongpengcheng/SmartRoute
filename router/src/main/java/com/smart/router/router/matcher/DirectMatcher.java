package com.smart.router.router.matcher;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;

import com.smart.router.router.RouteRequest;

/**
 * Created by Harry.Kong.
 * Time 2017/11/8.
 * Description:Absolutely matcher.
 */
public class DirectMatcher extends AbsExplicitMatcher {

    public DirectMatcher(int priority) {
        super(priority);
    }

    @Override
    public boolean match(Context context, Uri uri, @Nullable String route, RouteRequest routeRequest) {
        return !isEmpty(route) && uri.toString().equals(route);
    }

}
