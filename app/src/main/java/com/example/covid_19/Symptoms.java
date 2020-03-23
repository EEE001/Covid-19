package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Symptoms extends AppCompatActivity implements View.OnClickListener {

   private ImageView s1ImageView,s2ImageView;
   private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms2);

        s1ImageView = (ImageView) findViewById(R.id.s1Id);
        s2ImageView = (ImageView) findViewById(R.id.s2Id);
        button = (Button) findViewById(R.id.buttonId);


        s1ImageView.setOnClickListener(this);
        s2ImageView.setOnClickListener(this);



    }

    @Override
    public void onClick(View v){

        openPrevention();

        if(v.getId()==R.id.s1Id)
        {
          s1ImageView.setVisibility(View.GONE);
          s2ImageView.setVisibility(View.VISIBLE);


        }
        else if(v.getId()==R.id.s2Id)
        {
            s1ImageView.setVisibility(View.GONE);
            s2ImageView.setVisibility(View.VISIBLE);

        }


    }

    private void openPrevention(){
        Intent intent = new Intent(this,Prevention.class);
        startActivity(intent);
    }
}
