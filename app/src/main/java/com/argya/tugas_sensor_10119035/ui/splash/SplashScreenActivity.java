package com.argya.tugas_sensor_10119035.ui.splash;
/*
 *   NIM : 10119035
 *   NAMA : ARGYA AULIA FAUZANDIKA
 *   KELAS : IF-1
 * */

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.argya.tugas_sensor_10119035.MainActivity;
import com.argya.tugas_sensor_10119035.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3000);
    }
}