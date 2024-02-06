package com.example.numberguesser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener la referencia al TextView
        TextView textView = findViewById(R.id.textView);

        // Crear la animación de escala hacia adelante y hacia atrás
        Animation animation = new ScaleAnimation(
                1f, 1.2f, // Escala inicial y final en el eje X
                1f, 1.2f, // Escala inicial y final en el eje Y
                Animation.RELATIVE_TO_SELF, 0.5f, // Punto de pivote X
                Animation.RELATIVE_TO_SELF, 0.5f); // Punto de pivote Y
        animation.setDuration(1000); // Duración de la animación en milisegundos
        animation.setRepeatMode(Animation.REVERSE); // La animación se invertirá al finalizar
        animation.setRepeatCount(Animation.INFINITE); // Repetir infinitamente

        // Asignar la animación al TextView
        textView.startAnimation(animation);
    }
}