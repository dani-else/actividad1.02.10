package com.daniels.actividad10210;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button buttonVolver;
    private TextView outNombre, outSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonVolver = (Button) findViewById(R.id.buttonVolver);
        outNombre = (TextView) findViewById(R.id.outNombre);
        outSexo = (TextView) findViewById(R.id.outSexo);

        Intent i = getIntent();
        String nombre = i.getExtras().getString("nombre");
        String sexo = i.getExtras().getString("sexo");

        outNombre.setText(nombre);
        outSexo.setText(sexo);

    //Botón de vuelta
        Intent i2 = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(i2);
    }
}