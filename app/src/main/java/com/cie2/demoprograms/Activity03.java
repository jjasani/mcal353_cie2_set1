package com.cie2.demoprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Activity03 extends AppCompatActivity {

    EditText edtFirstName, edtLastName, edtUsername, edtPasswrod;
    Spinner spiCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_03);

        edtFirstName = findViewById(R.id.edtFirstName);
        edtLastName = findViewById(R.id.edtLastName);
        edtUsername = findViewById(R.id.edtUsername);
        edtPasswrod = findViewById(R.id.edtPassword);
        spiCity = findViewById(R.id.spiCity);
    }

    public void saveDataToDatabase(View view) {
        String valFirstname,
                valLastname,
                valUsername,
                valPassword,
                valCity;

        //Get EditText Values

    }
}
