package com.example.algaekey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class seisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seis);
    }
    public void startseteActivity (View view){
        Intent seteActivity = new Intent(this, seteActivity.class);
        startActivity(seteActivity);
    }
}
