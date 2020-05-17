package com.example.mediumreader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView browser;
    EditText link;
    Button btn_visit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        browser = (WebView) findViewById(R.id.webView);
        link = (EditText) findViewById(R.id.editTextLink);
        btn_visit = (Button) findViewById(R.id.btn_view);


        browser.setWebViewClient(new myWebViewClient());
    }

    private class myWebViewClient extends WebViewClient {
    }
}
