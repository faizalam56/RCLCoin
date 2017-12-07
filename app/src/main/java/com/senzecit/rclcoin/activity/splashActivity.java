package com.senzecit.rclcoin.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.senzecit.rclcoin.R;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);
    }
}
