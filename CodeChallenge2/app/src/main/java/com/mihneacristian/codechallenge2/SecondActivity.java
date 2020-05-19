package com.mihneacristian.codechallenge2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView) findViewById(R.id.textViewParagraphs);


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {

            String string = bundle.getString("stringId");
            textView.setText(string);
        }
    }
}
