package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button covid19Button;
    private   Intent intent;
    private ImageView imageView;
   //  String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        covid19Button = (Button) findViewById(R.id.covid19_ButtonId);
        covid19Button.setOnClickListener(this);

        imageView = (ImageView) findViewById(R.id.imageViewID);
        imageView.setImageResource(R.drawable.coronavirus2);
    }

    @Override
    public void onClick(View v) {


        intent = new Intent(MainActivity.this,Covid19. class);
        intent.putExtra("name","Covid-19");
        startActivity(intent);





    }
}
