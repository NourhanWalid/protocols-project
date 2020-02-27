package com.example.protocolsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button loginbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbutton=(Button)findViewById(R.id.login);
        loginbutton.setOnClickListener(
            new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    openListViewActivity();
                }
            }
        );
    }
    public void openListViewActivity(){
        Intent intent1=new Intent(this,ListActivity.class);
        startActivity(intent1);
    }
}
