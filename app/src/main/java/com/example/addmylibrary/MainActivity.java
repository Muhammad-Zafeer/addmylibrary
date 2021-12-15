package com.example.addmylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mylibrary.add;


public class MainActivity extends AppCompatActivity implements add.CallbackMethod {

    EditText e1,e2;
    Button button;
    add.CallbackMethod callbackMethod = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // mylibrary
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        button=findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add.add(e1.getText().toString(),e2.getText().toString(),callbackMethod);
            }
        });
    }


    @Override
    public void add1(int result) {
        Toast.makeText(this, ""+result, Toast.LENGTH_SHORT).show();
    }
}