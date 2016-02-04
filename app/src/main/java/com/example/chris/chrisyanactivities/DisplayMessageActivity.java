package com.example.chris.chrisyanactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    public final static String SEND_MESSAGE = "com.example.chris.chrisyanactivities.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView txtDisplayMessage = (TextView) findViewById(R.id.txtDisplayMessage);
        txtDisplayMessage.setText(message);

    }

    public void sendMessageAgain(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayTwoMessageActivity.class);
        Bundle extras = new Bundle();

        TextView txtDisplayMessage = (TextView) findViewById(R.id.txtDisplayMessage);
        String message = txtDisplayMessage.getText().toString();
        extras.putString(MainActivity.EXTRA_MESSAGE, message);

        EditText txtSendMessage = (EditText) findViewById(R.id.txtSendText);
        String sendMessage = txtSendMessage.getText().toString();
        extras.putString(SEND_MESSAGE, sendMessage);

        intent.putExtras(extras);
        startActivity(intent);
    }

}
