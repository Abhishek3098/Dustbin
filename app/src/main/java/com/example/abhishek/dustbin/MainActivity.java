package com.example.abhishek.dustbin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void garbageColl(View view) {
        Intent GCIntent = new Intent(getApplicationContext(), SignInGC.class);
        startActivity(GCIntent);
    }

    public void societySecretary(View view) {
        Intent SSIntent = new Intent(getApplicationContext(), SignInSS.class);
        startActivity(SSIntent);
    }
}
