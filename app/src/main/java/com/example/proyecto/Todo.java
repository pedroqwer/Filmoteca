package com.example.proyecto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Todo extends ArrayAdapter<Film> {
    private  int rr;
    private ArrayList<Film> films;
    public Todo(@NonNull Context context, int resource, @NonNull ArrayList<Film> objects) {
        super(context, resource, objects);
        rr=resource;
        films=objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(getContext());
        View mi=inflater.inflate(rr,parent,false);

        TextView titulo=mi.findViewById(R.id.tituloo);
        TextView director=mi.findViewById(R.id.directorrr);
        TextView genero =mi.findViewById(R.id.G);
        TextView anyo=mi.findViewById(R.id.anyoo);
        TextView formato=mi.findViewById(R.id.F);
        ImageView foto=mi.findViewById(R.id.imaa);
        TextView enlaceF=mi.findViewById(R.id.botonenlace);
        TextView comentario=mi.findViewById(R.id.comen);

        String tituliP=films.get(position).getTitle();
        titulo.setText(tituliP);

        String directorP=films.get(position).getDirector();
        director.setText(directorP);

        int fotoP=films.get(position).getImageResId();
        foto.setImageResource(fotoP);

        int generoP=films.get(position).getGenre();
        genero.setText(generoP);

        int anyoP =films.get(position).getYear();
        anyo.setText(anyoP);

        int formatoP=films.get(position).getFormat();
        formato.setText(formatoP);



        String enlaceP=films.get(position).getImdbUrl();
        enlaceF.setText(enlaceP);

        String comentarioP=films.get(position).getComments();
        comentario.setText(comentarioP);

        return  mi;
    }
}

