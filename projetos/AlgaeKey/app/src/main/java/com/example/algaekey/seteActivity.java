package com.example.algaekey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class seteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sete);
    }
    public void startoitoActivity (View view){
        Intent oitoActivity = new Intent(this, oitoActivity.class);
        startActivity(oitoActivity);
    }
}
