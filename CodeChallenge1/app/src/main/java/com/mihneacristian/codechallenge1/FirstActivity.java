package com.mihneacristian.codechallenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FirstActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(getClass().getName(), "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.e(getClass().getName(), "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.e(getClass().getName(), "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.e(getClass().getName(), "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.e(getClass().getName(), "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.e(getClass().getName(), "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.e(getClass().getName(), "onDestroy");
    }

    public void goToSecondActivity(View view) {

        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        startActivity(intent);
        Log.e(getClass().getName(), "goToSecondActivity");
    }
}
