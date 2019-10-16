package com.example.m7_activitat1_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.selector);
        spinner.setOnItemSelectedListener(this);


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


            if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("Home")){

                TextInputEditText quadreText = (TextInputEditText) findViewById(R.id.quadreTexthint);
                quadreText.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
            }
        if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("Work")){

            TextInputEditText quadreText = (TextInputEditText) findViewById(R.id.quadreTexthint);
            quadreText.setInputType(InputType.TYPE_CLASS_NUMBER);

        }

        if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("Mobile")){

            TextInputEditText quadreText = (TextInputEditText) findViewById(R.id.quadreTexthint);
            quadreText.setInputType(InputType.TYPE_CLASS_PHONE);

        }

        if (parent.getItemAtPosition(position).toString().equalsIgnoreCase("Other")){

            TextInputEditText quadreText = (TextInputEditText) findViewById(R.id.quadreTexthint);
            quadreText.setInputType(InputType.TYPE_CLASS_DATETIME);

        }




    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
