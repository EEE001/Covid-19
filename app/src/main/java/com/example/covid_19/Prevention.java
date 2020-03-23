package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Prevention extends AppCompatActivity  {

    private TextView textView;
    private ImageView imageView;
    private Button  button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);

        textView = (TextView) findViewById(R.id.textViewId);
        imageView = findViewById(R.id.p1Id);
        button = (Button) findViewById((R.id.buttonId));

        textView.setText(R.string.prevention_text);
        imageView.setImageResource(R.drawable.p1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInformation();
            }
        });



    }



    private void openInformation(){

        Intent intent = new Intent(this,Information.class);
        startActivity(intent);

    }



}
