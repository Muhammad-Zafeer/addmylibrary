package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class add extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    public static void add(String e1,String e2, CallbackMethod callbackMethod)
    {
        int num1;
        int num2;
        int sum;
       num1= Integer.parseInt(e2.toString());
       num2= Integer.parseInt(e1.toString());
       sum=num1+num2;
       CallbackMethod callback = callbackMethod;
       callback.add1(sum);
    }
    public interface CallbackMethod{
        public void add1(int result);
    }
}