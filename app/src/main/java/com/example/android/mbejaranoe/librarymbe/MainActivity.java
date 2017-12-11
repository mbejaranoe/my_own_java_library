package com.example.android.mbejaranoe.librarymbe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.mbejaranoe.jokewizard.JokeWizard;

import jokesmith.JokeSmith;

public class MainActivity extends AppCompatActivity {

    private TextView jokeSmithTextView;
    private TextView jokeWizardTextiew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JokeSmith jokeSmith = new JokeSmith();
        jokeSmithTextView = (TextView) findViewById(R.id.jokeSmith_textview);
        jokeSmithTextView.setText("Joke from JokeSmith: " + jokeSmith.getJoke());

        JokeWizard jokeWizard = new JokeWizard();
        jokeWizardTextiew = (TextView) findViewById(R.id.jokeWizard_textview);
        jokeWizardTextiew.setText("Joke from JokeWizard: " + jokeWizard.getJoke());
    }
}
