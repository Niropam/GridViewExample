package com.example.user.gridview;


import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageFlag;
    TextView textName;
    WebView site;
//    Resources resources=getResources();
//    String[] websites=resources.getStringArray(R.array.Websites);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

       site= (WebView) findViewById(R.id.website);
       imageFlag = (ImageView) findViewById(R.id.image);
       textName = (TextView) findViewById(R.id.title);

       Intent intent= getIntent();
       imageFlag.setImageResource(intent.getIntExtra("image",0));
       textName.setText(intent.getStringExtra("title"));
       site.loadUrl(intent.getStringExtra("sites"));

    }
}
