package com.example.algaekey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cincoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinco);
    }
    public void startseisActivity (View view){
        Intent seisActivity = new Intent(this, seisActivity.class);
        startActivity(seisActivity);
    }
}
