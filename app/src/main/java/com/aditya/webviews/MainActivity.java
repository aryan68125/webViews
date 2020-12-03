package com.aditya.webviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
 //webView is gonna allow us to view web content from the web
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //accessing webView
        webView = findViewById(R.id.webView);

        //checking wheather java script is enable or not
        webView.getSettings().setJavaScriptEnabled(true);

        //webView.setWebViewClient(new WebViewClient()); = it will open the website in this application
        //new WebViewClient() =  will allow us to open the website on our application
        //webView.setWebViewClient(); = it will open the website in chrome or fireFox whatever your default browser is
        webView.setWebViewClient(new WebViewClient());

        //giving the webView a url of a website that will load the website in the application
        webView.loadUrl("https://github.com/aryan68125?tab=repositories");
    }
}