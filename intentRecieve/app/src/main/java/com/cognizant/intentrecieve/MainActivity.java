package com.cognizant.intentrecieve;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    private TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = getIntent();
        String action = i.getAction();
        String type = i.getType();
        if (Intent.ACTION_SEND.equals(action) && type !=null ){
            if("text/plain".equals(type)){
                String getMessage = i.getStringExtra(Intent.EXTRA_TEXT);
                Log.d("Recieved",getMessage);
                message = (TextView)findViewById(R.id.hello);
                message.setText(getMessage);
            }
        }

    }
}
