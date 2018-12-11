package com.threeacmvolunteers.modules3acm.Module0;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.threeacmvolunteers.modules3acm.R;

public class Module0Handler extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentLogos nffA = new FragmentLogos();
        FragmentManager fragmentManager4 = getFragmentManager();
        android.app.FragmentTransaction ft1 = fragmentManager4.beginTransaction().replace(R.id.container, nffA);
        ft1.commit();

    }
}
