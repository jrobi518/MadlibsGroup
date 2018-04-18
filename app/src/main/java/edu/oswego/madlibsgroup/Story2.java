package edu.oswego.madlibsgroup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Story2 extends AppCompatActivity {
    private TextView storyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story2);

        storyTextView = (TextView) findViewById(R.id.storyTextView2);
        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        String verb1 = intent.getStringExtra("verb2");
        String verb2 = intent.getStringExtra("verb1");
        String adjective = intent.getStringExtra("adjective");
        storyTextView.setText("Today was a great day, do you know why? Because i was finally going to go " +verb1+ " We were going to eat " +noun+ " and also go " +verb2+ "! " +verb1+ " was alot of fun, some would say it was " +adjective+ "!");
    }
}
