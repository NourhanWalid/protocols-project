package com.example.protocolsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView = (ListView) findViewById(R.id.listview);
        ArrayList<String> types = new ArrayList<>();
        types.add("Android");
        types.add("iPhone");
        types.add("Windows");
        types.add("Blackberry");
        types.add("Linux");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, types);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                openDeviceDetailActivity();
            }
        });
    }
        public void openDeviceDetailActivity(){
            Intent intent2=new Intent(this,DeviceDetail.class);
            startActivity(intent2);
        }

}
