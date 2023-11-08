package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FilmEditActivity extends AppCompatActivity {

    private Film film;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_edit);


        Intent intent=getIntent();
        int posicion=intent.getIntExtra("FILM_POSITION",0);


        film=FilmDataSource.films.get(posicion);

        TextView tit=findViewById(R.id.ediciontitulo);
        tit.setText(film.getTitle());

        TextView dir=findViewById(R.id.ediciondirector);
        dir.setText(film.getDirector());

        TextView commm=findViewById(R.id.edicioncomentario);
        commm.setText(film.getComments());

        TextView imb=findViewById(R.id.editarnimb);
        imb.setText(film.getImdbUrl());


        ImageView imm=findViewById(R.id.imageView);
        imm.setImageResource(film.getImageResId());

        TextView any =findViewById(R.id.edicionAño);
        any.setText(String.valueOf(film.getYear()));

      /*  TextView form=findViewById(R.id.F);
        form.setText(Formato(film.getFormat()));

        TextView gen=findViewById(R.id.G);
        gen.setText(Genero(film.getGenre()));*/

    }
}