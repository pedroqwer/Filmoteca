package com.example.proyectopedro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FilmDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_data);

        Intent intent = getIntent();
        int position = intent.getIntExtra("FILM_POSITION", 0);

        Button button=findViewById(R.id.botonenlace);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url="R.id.botonenlace";


            }
        });
    }
}