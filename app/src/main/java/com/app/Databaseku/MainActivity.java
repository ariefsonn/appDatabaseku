package com.app.Databaseku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.app.Databaseku.databaseku.MyDatabaseku;

public class MainActivity extends AppCompatActivity {

    MyDatabaseku dg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dg = new MyDatabaseku(getApplication());
    }
}
