package com.daniels.actividad10210;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;
    private EditText inNombre;
    private RadioButton opc1Fem;
    private RadioButton opc2Masc;
    private RadioButton opc3NoResp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = (Button) findViewById(R.id.btnEnviar);
        inNombre = (EditText) findViewById(R.id.inNombre);
        opc1Fem = (RadioButton) findViewById(R.id.radioButton1);
        opc2Masc = (RadioButton) findViewById(R.id.radioButton2);
        opc3NoResp = (RadioButton) findViewById(R.id.radioButton3);

        capturarInfo();
    }

    public void capturarInfo(){
        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inNombre.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "El campo de texto no puede estar vacío", Toast.LENGTH_LONG).show();
                }else{
                    String nombre = "";
                    String sexo = "";

                    nombre = inNombre.getText().toString();
                    if(opc1Fem.isChecked()){
                        sexo = opc1Fem.getText().toString();
                    }else if(opc2Masc.isChecked()){
                        sexo = opc2Masc.getText().toString();
                    }else{
                        sexo = opc3NoResp.getText().toString();
                    }

                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    i.putExtra("nombre", nombre);
                    i.putExtra("sexo", sexo);
                    startActivity(i);
                }
            }
        });
    }
}