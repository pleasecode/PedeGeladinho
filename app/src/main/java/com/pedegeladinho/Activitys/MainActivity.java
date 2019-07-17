package com.pedegeladinho.Activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pedegeladinho.R;

public class MainActivity extends AppCompatActivity {

    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
