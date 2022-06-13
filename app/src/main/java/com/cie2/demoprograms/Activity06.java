package com.cie2.demoprograms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Activity06 extends AppCompatActivity {
    RecyclerView recyclerView;
    CustomAdapter mAdapter;
    JSONArray jsonArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_06);
        recyclerView = findViewById(R.id.recycleView);
        jsonArray = new JSONArray();
        readDataFromAsset();
    }

    private void readDataFromAsset() {
        ProgressDialog dialog = new ProgressDialog(Activity06.this);
        dialog.show();
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
                jsonArray = object.getJSONArray("users");
                mAdapter = new CustomAdapter(jsonArray);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                recyclerView.setAdapter(mAdapter);
                mAdapter.notifyDataSetChanged();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (dialog.isShowing())dialog.dismiss();
    }
}
