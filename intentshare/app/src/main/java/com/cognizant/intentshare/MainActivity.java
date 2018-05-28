package com.cognizant.intentshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onShareText(View view) {
        Intent shareText = new Intent();
        shareText.setAction(Intent.ACTION_SEND);
        shareText.setType("text/plain");
        shareText.putExtra(Intent.EXTRA_TEXT,"I am sharing something");
        Log.d("Sharing Text","from  this");
        startActivity(Intent.createChooser(shareText,"Share.."));
    }
}
