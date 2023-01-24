package com.dev.myappcompany.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myListView);

        final ArrayList<String> myAppleDevices = new ArrayList<String>();

        myAppleDevices.add("MacBook Air");
        myAppleDevices.add("MacBook Pro");
        myAppleDevices.add("Iphone 13 Pro");
        myAppleDevices.add("AirPods 3");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myAppleDevices);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.i("Device selected:", myAppleDevices.get(i));

                Toast.makeText(getApplicationContext(), "Device selected: " + myAppleDevices.get(i), Toast.LENGTH_LONG).show();

            }
        });

    }
}
