package com.example.checkboxdemo;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Button button1 = (Button)findViewById(R.id.button1);
    
    public void onClickbuttonMethod() {
        ProgressDialog prg1 = new ProgressDialog(this);
        prg1.setMessage("File Downloading...");
        prg1.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        prg1.setMax(100);
        prg1.show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (prg1.getProgress() <= prg1.getMax()) {
                        Thread.sleep(1000);
                        if (prg1.getProgress() == prg1.getMax()) {
                            prg1.dismiss();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}