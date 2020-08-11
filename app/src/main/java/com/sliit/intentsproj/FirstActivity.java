package com.sliit.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    public String number1,number2;
    EditText num,num2;
    private Object ViewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        num = (EditText)findViewById(R.id.number1);
        num2 = (EditText)findViewById(R.id.number2);
        LayoutInflater li =getLayoutInflater();
        View layout = li.inflate(R.layout.customtoast, (android.view.ViewGroup) ViewGroup);
        findViewById(R.id.custom_toast_layout);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setView(layout);
        toast.show();
    }
    public void ChangeDisplay(View view){
        number1 = num.getText().toString();
        int n1 = Integer.parseInt(number1);
        number2 = num2.getText().toString();
        int n2 = Integer.parseInt(number2);
        Context context = getApplicationContext();
        CharSequence massage = "Sending massage...";
        Toast toast = Toast.makeText(context,massage,Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,300);
        Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
        intent.putExtra("Number_1",n1);
        intent.putExtra("Number_2",n2);
        toast.show();
        startActivity(intent);
    }
}