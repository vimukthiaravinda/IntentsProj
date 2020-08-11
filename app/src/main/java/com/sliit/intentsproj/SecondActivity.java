package com.sliit.intentsproj;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity {
    public int number1,number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //number1 = intent.getStringExtra("Number_1");w
        //number2 = intent.getStringExtra("Number_2");
        //int number2 = intent.getIntExtra("Number_2",0);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = getIntent();
         number1 = intent.getIntExtra("Number_1",0);
         number2 = intent.getIntExtra("Number_2",0);
        EditText editText = (EditText)findViewById(R.id.editTextNumber4);
        editText.setText(String.valueOf(number1));
        EditText editText2 = (EditText)findViewById(R.id.editTextNumber3);
        editText2.setText(String.valueOf(number2));
    }
    public void OnPlus(View view){
        Context context = getApplicationContext();
        int sum = number1 + number2;
        TextView textView = (TextView)findViewById(R.id.answer);
        textView.setText(String.valueOf(sum));

    }
    public void onMinus(View view){
        Context context = getApplicationContext();
       int minus = number1 - number2;
        TextView textView = (TextView)findViewById(R.id.answer);
        textView.setText(String.valueOf(minus));
    }
    public void onMulti(View view){
        Context context = getApplicationContext();
        int multi = number1 * number2;
        TextView textView = (TextView)findViewById(R.id.answer);
        textView.setText(String.valueOf(multi));
    }
    public void onDivide(View view){
        Context context = getApplicationContext();
        int Divide = number1 / number2;
        TextView textView = (TextView)findViewById(R.id.answer);
        textView.setText(String.valueOf(Divide));
    }
}