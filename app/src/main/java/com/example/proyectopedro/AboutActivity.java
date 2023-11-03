package com.example.proyectopedro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //Boton 1
        Button button=findViewById(R.id.boton1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="";

                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                if (intent.resolveActivity(getPackageManager())!=null){
                    startActivity(intent);
                }

            }
        });

        //Boton 2
        Button button2=findViewById(R.id.boton2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String url="";

                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                if (intent.resolveActivity(getPackageManager())!=null){
                    startActivity(intent);
                }
            }
        });
        //boton 3
      //  Button boton3=findViewById(R.id.boton3);
        //boton3.setOnClickListener(new View.OnClickListener() {
           // @Override


    }

}