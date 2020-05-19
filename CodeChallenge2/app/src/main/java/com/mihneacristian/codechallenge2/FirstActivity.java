package com.mihneacristian.codechallenge2;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class FirstActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToSecondActivity(View view) {

        String result = "";
        switch (view.getId()) {

            case R.id.button1:
                result = getString(R.string.firstParagraphLoremIpsum);
                break;
            case R.id.button2:
                result = getString(R.string.secondParagraphLoremIpsum);
                break;
            case R.id.button3:
                result = getString(R.string.thirdParagraphLoremIpsum);
                break;
        }

        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        intent.putExtra("stringId", result);
        startActivity(intent);
    }

}
