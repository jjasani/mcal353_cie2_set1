package com.cie2.demoprograms;

import androidx.appcompat.app.AppCompatActivity;

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
        new TestAsyncTask().execute();
    }

    class TestAsyncTask extends AsyncTask {
        JSONArray jsonArray;

        @Override
        protected Object doInBackground(Object[] objects) {
            try {
                InputStream is = getAssets().open("data.json");
                int size = is.available();
                byte[] buffer = new byte[size];
                is.read(buffer);
                is.close();
                String json = new String(buffer, "UTF-8");
                Log.i("json", json);
                JSONObject jsonObject = new JSONObject(json);
                jsonArray = jsonObject.getJSONArray("formulas");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
            String count = String.valueOf(jsonArray.length());
            txtJsonDataCount.setText(count);
        }
    }
}
