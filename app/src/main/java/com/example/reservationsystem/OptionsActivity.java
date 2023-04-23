package com.example.reservationsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class OptionsActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView option = getListView();
        ArrayAdapter<Services>  listAdapter = new ArrayAdapter<Services>(
                this,
                android.R.layout.simple_list_item_1,
                Services.option
        );
        option.setAdapter(listAdapter);
    }
}