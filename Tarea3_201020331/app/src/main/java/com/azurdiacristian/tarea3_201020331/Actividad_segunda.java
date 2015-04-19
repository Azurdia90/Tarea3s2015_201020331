package com.azurdiacristian.tarea3_201020331;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Cristian on 19/04/2015.
 */
public class Actividad_segunda extends ActionBarActivity{
    //propiedades del activity
    private Button b_aceptar;
    private EditText eT_entrada;
    private TextView tV_salida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_segundo);
        iniciar_UI();
    }
    //haremos las referencias de los objetos con los componentes del layout
    public void iniciar_UI(){
        b_aceptar = (Button) findViewById(R.id.B_aceptar);
        eT_entrada =(EditText) findViewById(R.id.eT_entrada);
        tV_salida = (TextView) findViewById(R.id.tV_salida);
    }

    public void accion2(View v){
        //metodo de la accion del boton del segundo layout
        String aux ="";
        aux = eT_entrada.getText().toString();
        tV_salida.setText(aux);
    }

}
