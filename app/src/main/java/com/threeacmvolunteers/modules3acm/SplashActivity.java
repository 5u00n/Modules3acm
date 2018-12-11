package com.threeacmvolunteers.modules3acm;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.threeacmvolunteers.modules3acm.Module0.Module0Handler;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(SplashActivity.this,Module0Handler.class);
                startActivity(i);
                finish();
            }
        }, 2500);

    }
}
