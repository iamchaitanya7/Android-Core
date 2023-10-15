package com.example.buttonintentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    WebView browser;
    EditText link;
    Button btn_visit;
    URL url1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        browser=findViewById(R.id.webview);
        link=findViewById(R.id.editTextLink);
        btn_visit=findViewById(R.id.btn_view);

        browser.setWebViewClient(new myWebViewClient());
        btn_visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=link.getText().toString();
                //browser.getSettings().setLoadsImagesAutomatically(true);
                //browser.getSettings().setJavaScriptEnabled(true);
                //browser.loadUrl(url);

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }

    private class myWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

}
