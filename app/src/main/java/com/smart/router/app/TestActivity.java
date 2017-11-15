package com.smart.router.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.smart.router.annotation.InjectParam;
import com.smart.router.annotation.Route;
import com.smart.router.router.SmartRouter;

@Route("test")
public class TestActivity extends AppCompatActivity {
    @InjectParam
    String id = "0000";
    @InjectParam(key = "status")
    String sts = "default";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        SmartRouter.injectParams(this);
    }
}
