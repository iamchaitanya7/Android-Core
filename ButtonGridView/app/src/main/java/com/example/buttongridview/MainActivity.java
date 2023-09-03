package com.example.buttongridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    Button button;
    String[] languages = { "Java","Android","Php","HTML","CSS","Ruby","C","C++","Go","Kotlin","Python","OOP","Pearl","Ajax","Scala" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView)findViewById(R.id.gridView);
        button = (Button)findViewById(R.id.button1);

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.grid_item, R.id.button1, languages);
        gridView.setAdapter(adapter);

    }
}
