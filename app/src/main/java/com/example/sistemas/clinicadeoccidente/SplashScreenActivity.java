package com.example.sistemas.clinicadeoccidente;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Delayed;

public class SplashScreenActivity extends AppCompatActivity {

    long Dalay = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Timer RunSplash = new Timer();

        TimerTask ShowSplash = new TimerTask(){

            @Override
            public void run() {

                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);

                finish();
            }
        };

        RunSplash.schedule(ShowSplash, Dalay);

    }


}
