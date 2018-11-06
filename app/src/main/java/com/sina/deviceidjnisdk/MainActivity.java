package com.sina.deviceidjnisdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.sina.deviceidjnisdk.sina.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text);
        textView.setText(LcsGetKey.getHwPrivateKey());
        Log.i("Jni-->",LcsGetKey.getHwPubKey());
    }
}
