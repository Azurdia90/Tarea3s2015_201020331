package com.azurdiacristian.tarea3_201020331;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Actividad_principal extends ActionBarActivity {
    //objetos de los componentes utilizados
    private Button boton_siguiente;
    private TextView tV_siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_principal);
        iniciar_UI();
    }
    //haremos las referencias de los objetos con los componentes del layout
    public void iniciar_UI(){
        boton_siguiente = (Button) findViewById(R.id.B_next);
        tV_siguiente = (TextView) findViewById(R.id.tv_2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void accion1(View v){
        //metodo de la accion del boton
        //Intent se utiliza para el traslado a otro activity los parametros son:
        //la clase en la que me encuentra, la clase a la que me muevo
        Intent nuevolayout = new Intent(Actividad_principal.this, Actividad_segunda.class);
        //este comando nos permite ejecutar la accion de movernos es com el .show()
        startActivity(nuevolayout);
    }
}
