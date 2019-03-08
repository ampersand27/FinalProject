package com.omnicode.displayjokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {
    private String mJoke;
    private TextView tvJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        Bundle extras =getIntent().getExtras();
        if (extras == null)
            return;
        mJoke = extras.getString("JokeText");

        ShowJoke(mJoke);
    }

    private void ShowJoke(String mJoke) {
        tvJoke = findViewById(R.id.jokeTextView);
        tvJoke.setText(mJoke);
    }
}
