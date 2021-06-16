package com.haffid.myapppoemasgt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pulsar(View view) {
        Intent intent = null;
        if (view.getId() == R.id.btnCat1) {
            intent = new Intent(this, MACat1.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btnCat2) {
            intent = new Intent(this, MACat2.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.btnCat3) {
            intent = new Intent(this, MACat3.class);
            startActivity(intent);
        }
    }

}