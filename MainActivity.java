package com.example.diagnostico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final Random generador = new Random(); //Se crea una variable para generar números aleatorios
    private static final Integer[] imagenesID = //Se declara un array para que de éste tome los números la variable generador
            {R.drawable.uno, R.drawable.dos, R.drawable.tres, R.drawable.cuatro, R.drawable.cinco, R.drawable.seis, R.drawable.siete, R.drawable.ocho, R.drawable.nueve, R.drawable.diez};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer n = imagenesID[generador.nextInt(imagenesID.length)]; //Se crea una variable tipo Integer del tamaño del array creado anteriormente
        final ImageView iv = (ImageView) findViewById(R.id.imgRandom); //Se crea una variable tipo ImageView para que almacene las imágenes

        View botonNext = findViewById(R.id.b_Next); //Se declara una variable de tipo View para el llamado del botón
        botonNext.setOnClickListener(new View.OnClickListener() { //Se declara la acción que realizará el botón al dar click
            @Override
            public void onClick(View v) { //Se declara un método para colocar la imagen en el ImageView
                int buscar = imagenesID[generador.nextInt(imagenesID.length)]; //Asigna a la variable buscar el valor de generador
                iv.setImageResource(buscar); //Se asigna a la variable iv el valor obtenido de buscar
            }
        });
    }

}