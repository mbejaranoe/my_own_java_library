package com.example.android.mbejaranoe.jokewizard;
import jokesmith.JokeSmith;

public class JokeWizard {
    public String getJoke(){
        return new JokeSmith().getJoke();
    }
}
