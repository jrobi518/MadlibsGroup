package edu.oswego.madlibsgroup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Story1 extends AppCompatActivity {

    private TextView storyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story1);

        storyTextView = (TextView) findViewById(R.id.storyTextView1);
        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        String verb1 = intent.getStringExtra("verb2");
        String verb2 = intent.getStringExtra("verb1");
        String adjective = intent.getStringExtra("adjective");
        storyTextView.setText("It was Christmas Eve and my family was sitting at the table, ready to dig into the delicious " + noun + " on the table." + "I was so hungry, I could " + verb1 + " a horse." + "I had 3 helpings, and was so stuffed, I could barely " + verb2 + " up the stairs." + "I then went to bed, falling into a " + adjective + " sleep.");;
    }
}
