    package com.example.ffscalco.lpa_ecomms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = findViewById(R.id.webview);
        WebSettings webSettings = mWebView .getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView .loadUrl("https://linksoad28.000webhostapp.com/");
    }
}
