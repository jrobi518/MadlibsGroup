package edu.oswego.madlibsgroup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Story3 extends AppCompatActivity {
    private TextView storyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story3);

        storyTextView = (TextView) findViewById(R.id.storyTextView3);
        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        String verb1 = intent.getStringExtra("verb2");
        String verb2 = intent.getStringExtra("verb1");
        String adjective = intent.getStringExtra("adjective");
        storyTextView.setText("Once upon a time there was a small " + noun + "." + "It was so small, that it could " + verb1 + "into any opening." + "It also loved " + verb2 + "." + "The " + noun + " had a firm belief that without " + verb2 + " is not a fun life. " + "That's the story of the " + adjective + " mouse.");
    }
}