package com.smart.router.router.util;

import android.util.Log;

/**
 * Internal simple log.
 * <p>
 */
public class RLog {
    private static final String TAG = "SmartRouter";
    private static boolean sLoggable = false;

    public static void showLog(boolean loggable) {
        sLoggable = loggable;
    }

    public static void i(String msg) {
        if (sLoggable) {
            Log.i(TAG, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (sLoggable) {
            Log.i(tag, msg);
        }
    }

    public static void w(String msg) {
        if (sLoggable) {
            Log.w(TAG, msg);
        }
    }

    public static void e(String msg) {
        Log.e(TAG, msg);
    }

    public static void e(String msg, Throwable tr) {
        Log.e(TAG, msg, tr);
    }
}
