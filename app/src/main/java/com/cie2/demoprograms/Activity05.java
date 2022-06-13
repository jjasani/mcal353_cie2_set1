package com.cie2.demoprograms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class Activity05 extends AppCompatActivity {
    TextView txtJsonDataCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_05);
        txtJsonDataCount = findViewById(R.id.txtJsonDataCount);
        String fileData = null;

        try {
            InputStream is = getAssets().open("usersdata.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            fileData = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (fileData!=null){
            try {
                JSONObject object = new JSONObject(fileData);
                //Code goes here
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
