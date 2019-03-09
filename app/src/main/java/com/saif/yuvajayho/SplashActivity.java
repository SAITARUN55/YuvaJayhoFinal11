package com.saif.yuvajayho;

import android.app.Activity;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class SplashActivity extends AppCompatActivity {
    private static  int SPLASH_TIME_OUT = 3500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent splashIntent = new Intent(SplashActivity.this,MainActivity.class);
                                          startActivity(splashIntent);
                                          finish();
                                      }
                                  }
                ,SPLASH_TIME_OUT);
    }

}
