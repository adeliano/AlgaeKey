package com.example.algaekey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class noveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nove);
    }
    public void startdezActivity (View view){
        Intent dezActivity = new Intent(this, dezActivity.class);
        startActivity(dezActivity);
    }
}
