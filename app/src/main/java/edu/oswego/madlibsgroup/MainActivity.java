package edu.oswego.madlibsgroup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private Button inputButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputButton = (Button) findViewById(R.id.inputButton);
        inputButton.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, inputActivity.class);
                startActivity(intent);
            }
        });
    }
}