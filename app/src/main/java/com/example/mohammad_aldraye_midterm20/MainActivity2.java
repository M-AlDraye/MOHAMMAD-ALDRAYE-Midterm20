package com.example.mohammad_aldraye_midterm20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {
    Button actjump;
    Button actjump2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("You are in Activity 2");
        Calendar.getInstance().get(Calendar.YEAR);
        actjump = (Button) findViewById(R.id.actjump);
        actjump.setOnClickListener(actjumpp);
        actjump2 = (Button) findViewById(R.id.actjump2);
        actjump2.setOnClickListener(actjumpp2);
        final EditText nameInput;
        final EditText yearInput;
        final TextView output;
        final int currentyear = 2020;
        final RadioButton gmale= (RadioButton) findViewById(R.id.male);
        final RadioButton gfemale = (RadioButton) findViewById(R.id.female);
        Button ShowInput = (Button) findViewById(R.id.input);
        ShowInput.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double Num = Double.parseDouble(yearInput.getText().toString());
                String Name = EditText.getText().toString();

                if (gmale.isChecked()) {
                    double age = Num - 2020
                    output.setText("Hi Mr." + Name + ", You are" + age + " years old.");

                }
                if (gfemale.isChecked()) {
                    double age = Num - 2020
                    output.setText("Hi Miss" + Name + ", You are" + age + " years old.");
                }
            }
            Button.OnClickListener actjumpp = new Button.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity2.this, MainActivity.class));
                }
            };
            Button.OnClickListener actjumpp2 = new Button.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity2.this, MainActivity3.class));
                }
        }
    }