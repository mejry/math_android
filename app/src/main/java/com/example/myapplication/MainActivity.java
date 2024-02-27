package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText t1 ,t2;
    Button click;
    RadioButton b1,b2,b3,b4;
    TextView affiche;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        t1= findViewById(R.id.number1);
        t2=findViewById(R.id.number2);
        click=findViewById(R.id.click);
        b1=findViewById(R.id.fois);
        b2=findViewById(R.id.addition);
        b3=findViewById(R.id.division);
        b4=findViewById(R.id.sousraction);
        affiche=findViewById(R.id.affiche);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = t1.getText().toString();
                String input1 = t1.getText().toString();
                if (input.isEmpty() && input1.isEmpty()) {
                    affiche.setText("Please enter a number");
                    return;
                }
                try {
                    Float n1 = Float.parseFloat(input);
                    Float n2 = Float.parseFloat(input1);
                    if (b1.isChecked()) {
                        affiche.setText((n1 * n2) + "");
                    }
                    if (b2.isChecked()) {
                        affiche.setText((n1 + n2) + "");
                    }
                    if (b3.isChecked()) {
                        affiche.setText((n1 / n2) + "");
                    }
                    if (b4.isChecked()) {
                        affiche.setText((n1 - n2) + "");
                    }
                } catch (NumberFormatException e) {
                    affiche.setText("Invalid input. Please enter a valid number.");
                }
            }
        });
    }
}