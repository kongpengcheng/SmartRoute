package com.smart.router.router;

import android.net.Uri;

/**
 * Created by Harry.Kong..
 */
public interface RouteCallback {
    /**
     * Callback
     *
     * @param state   {@link RouteResult}
     * @param uri     Uri
     * @param message notice msg
     */
    void callback(RouteResult state, Uri uri, String message);
}
