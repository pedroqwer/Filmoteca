package com.example.proyectopedro;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Movie;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FilmDataSource.Initialize();
        ListView lista=(ListView) findViewById(R.id.listaa);
        FilmListActivity filmListActivity=new FilmListActivity(this,R.layout.mostrar, FilmDataSource.films);
        // Enlace
        /* lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Movie selectedMovie = movieList.get(position); // Obtener la película seleccionada
                Intent intent = new Intent(MainActivity.this, FilmDataActivity.class);
                intent.putExtra("movie", selectedMovie); // Pasa la película seleccionada a la próxima actividad
                startActivity(intent);
            }

           @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Movie selectedMovie = movieList.get(position); // Obtener la película seleccionada
                Intent intent = new Intent(MainActivity.this, FilmDataActivity.class);
                intent.putExtra("movie", selectedMovie); // Pasa la película seleccionada a la próxima actividad
                startActivity(intent);
            }
        });

        Intent intent = new Intent(this, FilmDataActivity.class);
        boolean position = false;
        intent.putExtra("FILM_POSITION",position);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

*/
        lista.setAdapter(filmListActivity);

        // ArrayAdapter<Film> adapter=new ArrayAdapter<Film>(this,R.layout.activity_film_data);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return  true;
    }
    @Override
    public boolean onOptionsItemSelected (@NonNull MenuItem item){

        int id=item.getItemId();

        if(id==R.id.opcion1){
            Toast.makeText(getApplicationContext(), "Has pulsado Acerca de ", Toast.LENGTH_LONG).show();
            Intent si=new Intent(this,AboutActivity.class);
            startActivity(si);
            return true;
        }else if (id==R.id.opcion2){
            Toast.makeText(getApplicationContext(),"Has pulsado añadir peliculas",Toast.LENGTH_LONG).show();
            Intent si=new Intent(this,FilmDataActivity.class);
            startActivity(si);
            return true;
        }

        return  super.onOptionsItemSelected(item);
    }

}