package com.cie2.demoprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }


    public void btnClick(View view) {
        switch (view.getId()){
            case R.id.btn01:
                startActivity(new Intent(Dashboard.this,Activity01.class));
                break;
            case R.id.btn02:
                startActivity(new Intent(Dashboard.this,Activity02.class));
                break;
            case R.id.btn03:
                startActivity(new Intent(Dashboard.this,Activity03.class));
                break;
            case R.id.btn04:
                startActivity(new Intent(Dashboard.this,Activity04.class));
                break;
            case R.id.btn05:
                startActivity(new Intent(Dashboard.this,Activity05.class));
                break;
            case R.id.btn06:
                startActivity(new Intent(Dashboard.this,Activity06.class));
                break;
            case R.id.btn07:
                startActivity(new Intent(Dashboard.this,Activity07.class));
                break;
            case R.id.btn08:
                startActivity(new Intent(Dashboard.this,Activity08.class));
                break;
        }
    }
}
