package com.cie2.demoprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity04 extends AppCompatActivity {
    ArrayList<String> cities;
    ListView lstCity;
    ArrayAdapter<String> adapter;
    DatabaseHelper dbh;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_04);

        lstCity = findViewById(R.id.lstCity);
        cities = new ArrayList<String>();

        dbh = new DatabaseHelper(this);
        db = dbh.getReadableDatabase();

        // Write a code over here to fetch data from db.

        adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                cities
        );
        lstCity.setAdapter(adapter);
    }
}
