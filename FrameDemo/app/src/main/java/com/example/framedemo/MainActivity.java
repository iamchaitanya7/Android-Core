package com.example.framedemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }
    public void addListenerOnButtonClick(){
        CheckBox check1 = (CheckBox) findViewById(R.id.check1);
        CheckBox check2 = (CheckBox) findViewById(R.id.check2);
        CheckBox check3 = (CheckBox) findViewById(R.id.check3);
        CheckBox check4 = (CheckBox) findViewById(R.id.check4);
        CheckBox check5 = (CheckBox) findViewById(R.id.check5);
        Button but1 = (Button) findViewById(R.id.but1);

        but1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(check1.isChecked()){
                    Toast.makeText(getApplicationContext(),check1.getText(), Toast.LENGTH_LONG).show();
                }
                if(check2.isChecked()){
                    Toast.makeText(getApplicationContext(),check2.getText(), Toast.LENGTH_LONG).show();
                }
                if(check3.isChecked()){
                    Toast.makeText(getApplicationContext(),check3.getText(), Toast.LENGTH_LONG).show();
                }
                if(check4.isChecked()){
                    Toast.makeText(getApplicationContext(),check4.getText(), Toast.LENGTH_LONG).show();
                }
                if(check5.isChecked()){
                    Toast.makeText(getApplicationContext(),check5.getText(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}  