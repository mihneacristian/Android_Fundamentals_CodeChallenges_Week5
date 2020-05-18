package com.mihneacristian.codechallenge3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {

    public static final String SENDER_MESSAGE = "SENDER_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);


        TextView textViewMessageReceived = (TextView) findViewById(R.id.messageReceived);
        textViewMessageReceived.setText("Message received");

        Intent intent = getIntent();

        TextView textViewMessageSentFromSenderctivity = (TextView) findViewById(R.id.sentMessage);

        String string = intent.getStringExtra(SenderActivity.SENDER_MESSAGE);

        textViewMessageSentFromSenderctivity.setText(string);

        Button receiverButton = (Button) findViewById(R.id.ReceiverButton);
        receiverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sendMessageToFirstctivity();
            }
        });
    }

    public void sendMessageToFirstctivity() {

        EditText editTextSenderActivity = (EditText) findViewById(R.id.ReceiverEditText);
        String string = editTextSenderActivity.getText().toString();

        Intent intent = new Intent(ReceiverActivity.this, SenderActivity.class);
        intent.putExtra(SENDER_MESSAGE, string);
        startActivity(intent);
    }
}