package com.smart.router.app;

import android.app.Application;

import com.smart.router.router.Configuration;
import com.smart.router.router.Router;


/**
 * <p>
 * Created by Cheney on 2017/1/12.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // init
        Router.initialize(new Configuration.Builder()
                .setDebuggable(BuildConfig.DEBUG)
                .registerModules("app")
                .build());
    }
}
