package com.mihneacristian.codechallenge3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SenderActivity extends AppCompatActivity {

    public static final String SENDER_MESSAGE = "SENDER_TEXT";

    private TextView textViewReplyReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewReplyReceived = (TextView) findViewById(R.id.replyReceived);

        Intent intent = getIntent();

        TextView textViewMessageSentFromReceiverActivity = (TextView) findViewById(R.id.receivedMessage);

        String string = intent.getStringExtra(ReceiverActivity.SENDER_MESSAGE);

        if (string != null) {

            String result = "Reply received";
            textViewReplyReceived.setText(result);
        }

        textViewMessageSentFromReceiverActivity.setText(string);

        Button senderButton = (Button) findViewById(R.id.SenderButton);
        senderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sendMessageToSecondActivity();
            }
        });

    }

    public void sendMessageToSecondActivity() {

        EditText editTextSenderActivity = (EditText) findViewById(R.id.SenderEditText);
        String string = editTextSenderActivity.getText().toString();

        Intent intent = new Intent(SenderActivity.this, ReceiverActivity.class);
        intent.putExtra(SENDER_MESSAGE, string);
        startActivity(intent);
    }
}
