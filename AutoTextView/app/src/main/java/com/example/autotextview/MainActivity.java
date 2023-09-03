package com.example.autotextview;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] language ={"C","C++","Java","Android",".NET","Python","CSS","HTML","OOP","ASP.NET","PHP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter xyz = new ArrayAdapter (this,android.R.layout.list_content,language);
        AutoCompleteTextView abc = findViewById(R.id.autoCompleteTextView);
        abc.setAdapter(xyz);
        abc.setThreshold(3);
    }
}