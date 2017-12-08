package com.example.android.mbejaranoe.librarymbe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import jokesmith.JokeSmith;

public class MainActivity extends AppCompatActivity {

    private TextView jokeSmithTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JokeSmith jokeSmith = new JokeSmith();
        jokeSmithTextView = (TextView) findViewById(R.id.jokeSmith_textview);

        jokeSmithTextView.setText(jokeSmith.getJoke());
    }
}
