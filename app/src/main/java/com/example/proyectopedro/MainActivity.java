package com.example.proyectopedro;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

        lista.setAdapter(filmListActivity);


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
            return true;
        }else if (id==R.id.opcion2){
            Toast.makeText(getApplicationContext(),"Has pulsado añadir pekiculas",Toast.LENGTH_LONG).show();
        }

        return  super.onOptionsItemSelected(item);
    }

}