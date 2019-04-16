package com.example.algaekey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dezActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dez);
    }
    public void startonzeActivity (View view){
        Intent onzeActivity = new Intent(this, onzeActivity.class);
        startActivity(onzeActivity);
    }
    public void startdozeActivity (View view){
        Intent dozeActivity = new Intent(this, dozeActivity.class);
        startActivity(dozeActivity);
    }
}
