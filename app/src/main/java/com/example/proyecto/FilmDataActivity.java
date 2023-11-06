package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FilmDataActivity extends AppCompatActivity {

    Button volver;

    Button editar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_data);

        volver=(Button)findViewById(R.id.BotonvolverList);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Has vuelto al inicio", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(FilmDataActivity.this,MainActivity.class);
                startActivity(i);

            }
        });

        editar=(Button) findViewById(R.id.edit);

        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Edición de película", Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(FilmDataActivity.this, FilmEditActivity.class);
                startActivity(intent);

            }
        });

    }
}