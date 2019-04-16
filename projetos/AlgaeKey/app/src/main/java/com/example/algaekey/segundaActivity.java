package com.example.algaekey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class segundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
    }
    public void startterceiraActivity (View view){
        Intent terceiraActivity = new Intent(this, terceiraActivity.class);
        startActivity(terceiraActivity);
    }

}
