package com.example.reservationsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class First_Interface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_interface);

        ListView listV = (ListView) findViewById(R.id.list_options);

        ArrayAdapter<Services> listAd = new ArrayAdapter<Services>(
                this ,
                android.R.layout.simple_list_item_1,
                Services.option
        );
        listV.setAdapter(listAd);
    }
}