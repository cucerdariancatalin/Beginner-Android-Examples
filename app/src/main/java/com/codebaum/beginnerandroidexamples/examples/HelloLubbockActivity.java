package com.codebaum.beginnerandroidexamples.examples;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.codebaum.beginnerandroidexamples.R;

/**
 * Created on 1/7/18.
 */

public class HelloLubbockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_hello_world);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Hello, Lubbock!");
    }
}
