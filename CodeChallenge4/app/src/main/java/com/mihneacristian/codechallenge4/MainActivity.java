package com.mihneacristian.codechallenge4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private String string;
    private String phoneNumber;
    private String locationName;
    private String urlAddress;
    private String userInputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callNumberIntent(View view) {

        final EditText phoneNumberEditText;
        phoneNumberEditText = (EditText) findViewById(R.id.callNumber);
        string = phoneNumberEditText.getText().toString().trim();
        phoneNumber = "tel: " + string;

        Button callNumberButton = (Button) findViewById(R.id.callNumberButton);
        callNumberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                string = phoneNumberEditText.getText().toString().trim();
                phoneNumber = "tel: " + string;
                intent.setData(Uri.parse(phoneNumber));
                startActivity(intent);
            }
        });
    }

    public void openLocationIntent(View view) {

        EditText locationEditText;
        locationEditText = (EditText) findViewById(R.id.openLocation);
        string = locationEditText.getText().toString().trim();
        locationName = "geo:0,0?q=" + string;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(locationName));
        startActivity(intent);
    }

    public void openURLIntent(View view) {

        EditText urlEditText;
        urlEditText = (EditText) findViewById(R.id.openURL);
        string = urlEditText.getText().toString().trim();
        urlAddress = string;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
        startActivity(intent);
    }

    public void shareTextIntent(View view) {

        EditText userInputEditText;
        userInputEditText = (EditText) findViewById(R.id.shareText);
        string = userInputEditText.getText().toString().trim();
        userInputText = string;
        Intent userInputIntent = new Intent(Intent.ACTION_SEND);
        userInputIntent.putExtra(Intent.EXTRA_TEXT, userInputText);
        userInputIntent.setType("text/plain");
        Intent shareUserInputItent = Intent.createChooser(userInputIntent, null);
        startActivity(shareUserInputItent);

    }
}
