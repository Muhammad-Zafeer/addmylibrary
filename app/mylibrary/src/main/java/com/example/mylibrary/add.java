package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class add extends AppCompatActivity {
    EditText e1,e2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        button=findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add();
            }
        });
    }
    public int add()
    {
        int num1;
        int num2;
        int sum;
       num1= Integer.parseInt(e2.getText().toString());
       num2= Integer.parseInt(e1.getText().toString());
       sum=num1+num2;
       return sum;
    }
}