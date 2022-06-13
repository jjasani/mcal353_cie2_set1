package com.cie2.demoprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Activity07 extends AppCompatActivity {
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_07);

        TextView textView = findViewById(R.id.txtSharedPrefCounter);
        sharedPreferences = getSharedPreferences(MyUtil.pref_name,MODE_PRIVATE);
        String text = String.valueOf(sharedPreferences.getInt(MyUtil.pref_key,0));
        textView.setText(text);
    }
}
