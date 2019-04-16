package com.example.algaekey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class quatro1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quatro1);
    }
    public void startcincoActivity (View view){
        Intent cincoActivity = new Intent(this, cincoActivity.class);
        startActivity(cincoActivity);
    }
}
