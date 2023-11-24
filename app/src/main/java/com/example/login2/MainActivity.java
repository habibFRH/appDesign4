package com.example.login2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = findViewById(R.id.txt);
        Button btn1 =findViewById(R.id.button1);


        Intent intent = new Intent(MainActivity.this,Secondactivity.class);
        Intent intent2 = getIntent();
        String textwritten = intent2.getStringExtra("txt");
        if (textwritten !=null){
            txt.setText(textwritten);
        }
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}