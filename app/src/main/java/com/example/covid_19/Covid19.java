package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Covid19 extends AppCompatActivity  {

   private   ImageView imageView;
   private   TextView textView;
   private   Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid19);

        button = (Button) findViewById(R.id.buttonId);
        imageView= (ImageView) findViewById(R.id.imageViewID);
        textView = (TextView) findViewById(R.id.textViewID);


       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openSymptoms();
           }
       });


       Bundle bundle = getIntent().getExtras();
       if(bundle != null){

           String Name = bundle.getString("name");
           imageView.setImageResource(R.drawable.coronavirus);
           textView.setText(R.string.covid19_text);
       }


    }

    private void openSymptoms() {
        Intent intent = new Intent(this,Symptoms.class);
        startActivity(intent);
    }



}
