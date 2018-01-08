package com.anime.rezero.docbaorss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class NewsActivity extends AppCompatActivity {
    WebView webTinTuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        webTinTuc = (WebView) findViewById(R.id.web_tintuc);
        Intent intent = getIntent();
        String link = intent.getStringExtra("linktintuc");
        webTinTuc.loadUrl(link);
        webTinTuc.setWebViewClient(new WebViewClient()); // để khi click vào 1 đường dẫn khác nó k bị vào trình duyệt
                                                //mặc định của điện thoại mà nó vẫn ở trong app của mình
    }
}
