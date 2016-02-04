package com.example.chris.chrisyanactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DisplayTwoMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_two_message);
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
        Bundle extras = intent.getExtras();

        String firstMessage = extras.getString(MainActivity.EXTRA_MESSAGE);
        TextView txtFirstMessage = (TextView) findViewById(R.id.txtFirst);
        txtFirstMessage.setText("First Message: " + firstMessage);

        String secondMessage = extras.getString(DisplayMessageActivity.SEND_MESSAGE);
        TextView txtSecondMessage = (TextView) findViewById(R.id.txtSecond);
        txtSecondMessage.setText("Second Message: " + secondMessage);
    }

}
