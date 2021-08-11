package com.example;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView statusTextView;

    @Override
    public void onCreate(final Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.main);
        statusTextView = (TextView) findViewById(R.id.status);
        statusTextView.setText("Ready");
    }

}
