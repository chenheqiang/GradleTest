package com.example.progect.mygradleproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       String str =  BuildConfig.StrTest;
        ((TextView) findViewById(R.id.test_tv)).setText(str);
    }
}
