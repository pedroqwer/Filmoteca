package com.example.proyectopedrosnachez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FilmDataSource.Initialize();
        ListView lista=(ListView) findViewById(R.id.listaa);
        FilmListActivity filmListActivity=new FilmListActivity(this,R.layout.mostrar, FilmDataSource.films);

        lista.setAdapter(filmListActivity);

        /*
        *  Button button=findViewById(R.id.boton1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://github.com/pedroqwer/FilmotecaPedroSanchezBoix";

                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(intent);
                }
            }
        });*/
    }
}