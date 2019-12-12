package com.codesdeal.recyclerv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SpalshScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_spalsh_screen);

        startActivity(new Intent(SpalshScreenActivity.this,MainActivity.class));
        finish();
    }
}
