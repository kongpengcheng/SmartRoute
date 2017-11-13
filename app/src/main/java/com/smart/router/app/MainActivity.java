package com.smart.router.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.smart.router.router.Router;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_test = findViewById(R.id.btn_test);
        btn_test.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btn_test) {
            Router.build("test").go(this);
        }
    }
}
