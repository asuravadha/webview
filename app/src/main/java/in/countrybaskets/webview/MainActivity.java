package in.countrybaskets.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
WebView webview;
EditText url;
String googleurl="https://www.google.com/search?q=";
String youtubeurl="https://www.youtube.com/results?search_query=";
Button google,youtube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url=findViewById(R.id.url);
        google=findViewById(R.id.google);
        youtube=findViewById(R.id.youtube);
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 webpage(googleurl,url.getText().toString());
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webpage(youtubeurl,url.getText().toString());

            }
        });


    }

    private void webpage(String baseurl,String link) {
        webview=findViewById(R.id.webview);
        WebViewClient webViewClient=new WebViewClient();
        webview.setWebViewClient(webViewClient);
        webview.loadUrl(baseurl+link);
        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
