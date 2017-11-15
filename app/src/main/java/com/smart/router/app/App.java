package com.smart.router.app;

import android.app.Application;

import com.smart.router.router.Configuration;
import com.smart.router.router.SmartRouter;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // init
        SmartRouter.initialize(new Configuration.Builder()
                .setDebuggable(BuildConfig.DEBUG)
                .registerModules("app")
                .build());
    }
}
