package com.saif.yuvajayho;

import android.content.Intent;
import android.os.BadParcelableException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Baptala extends AppCompatActivity {

    Button button16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baptala);

        button16 = (Button)findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Baptala.this,Home.class));
            }
        });
    }
}
