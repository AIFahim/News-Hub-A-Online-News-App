package com.codesdeal.recyclerv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class ProthomaloActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prothomalo);

        webView = (WebView) findViewById(R.id.prothomalo_Webview);

        Intent intent = getIntent();
        String j = intent.getExtras().getString("name");
        // Bundle b = intent.getExtras();


//        if(b!= null)
//        {
//            String j  = (String) b.get("name");
        //Toast.makeText(this, ""+j+" kkkkk", Toast.LENGTH_SHORT).show();
        if (j.equals("Prothom-Alo")) {
            //Toast.makeText(this, "if check", Toast.LENGTH_SHORT).show();
            webView.loadUrl("https://www.prothomalo.com/");
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());

//            }
//
        }

        // "Prothom-Alo","Jugantor","KalerKantho","Bangladesh Protidin","Bdnews24","BBC Bangla","Banglanews24"
        else if( j.equals("Jugantor")){
            webView.loadUrl("https://www.jugantor.com/");
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
        }
        else if( j.equals("KalerKantho")){
            webView.loadUrl("https://www.kalerkantho.com/");
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
        }
        else if( j.equals("Bangladesh Protidin")){
            webView.loadUrl("https://www.bd-pratidin.com/");
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
        }
        else if( j.equals("Bdnews24")){
            webView.loadUrl("http://bdnews24.com/");
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
        }
        else if( j.equals("BBC Bangla")){
            webView.loadUrl("https://www.bbc.com/bengali");
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
        }
        else if( j.equals("Banglanews24")){
            webView.loadUrl("https://www.banglanews24.com/");
            WebSettings webSettings = webView.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
        }



//    @Override
//    public void onBackPressed() {
//        if (webView.canGoBack())
//        {
//            webView.goBack();
//        }
//        else
//            {
//                super.onBackPressed();
//            }
//    }
    }
}
