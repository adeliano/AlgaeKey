package com.example.algaekey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class onzeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onze);
    }
    public void startcincoActivity (View view){
        Intent cincoActivity = new Intent(this, cincoActivity.class);
        startActivity(cincoActivity);
    }
}
