package com.codesdeal.recyclerv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity
{
    ArrayList<String> cityNames = new ArrayList<>(Arrays.asList("Prothom-Alo","Jugantor","KalerKantho","Bangladesh Protidin","Bdnews24","BBC Bangla","Banglanews24"));


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView RV = (RecyclerView) findViewById(R.id.recyclerViewID);
        RV.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapt = new MyAdapter(this, cityNames);
        RV.setAdapter(adapt);

        //getActionBar().setTitle(R.string.app_name);



    }
}
