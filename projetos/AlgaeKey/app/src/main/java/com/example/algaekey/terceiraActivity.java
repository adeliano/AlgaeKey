package com.example.algaekey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class terceiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);
    }
    public void startquatro1Activity (View view){
        Intent quatro1Activity = new Intent(this, quatro1Activity.class);
        startActivity(quatro1Activity);
    }
}
