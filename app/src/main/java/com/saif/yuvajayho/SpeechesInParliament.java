package com.saif.yuvajayho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SpeechesInParliament extends AppCompatActivity {

    Button button21,button22,button23,button24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speeches_in_parliament);

        button21 =(Button)findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SpeechesInParliament.this,JayProfile.class));
            }
        });

        button22 = (Button)findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SpeechesInParliament.this,Schedule.class));
            }
        });

        button23 = (Button)findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SpeechesInParliament.this,JayActEvents.class));
            }
        });

        button24 = (Button)findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SpeechesInParliament.this,Home.class));
            }
        });
    }
}
