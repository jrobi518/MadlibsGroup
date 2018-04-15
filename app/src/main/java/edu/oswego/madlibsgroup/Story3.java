package edu.oswego.madlibsgroup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Story3 extends AppCompatActivity {
    private TextView storyTextView

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
        storyTextView.setText("Test" + noun + "Test" + verb1 + "Test" + verb2 + "Test" + adjective + "Test.");
}
