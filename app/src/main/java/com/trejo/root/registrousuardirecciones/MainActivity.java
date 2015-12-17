package com.trejo.root.registrousuardirecciones;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    EditText nombreU;
    EditText emailU;
    EditText passU;
    Button bDireccion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "En proceso de creacion", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        findViewById(R.id.btnDireccion).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2ActivityVentana.class));
            }
        });
        nombreU = (EditText) findViewById(R.id.textNombre);
        emailU=(EditText) findViewById(R.id.textCorreo);
        passU=(EditText) findViewById(R.id.textPasswordp);
        bDireccion=(Button) findViewById(R.id.btnDireccion);
        bDireccion.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v){
        String nombrep="";
        String  emailp="";
        String passp="";
        switch (v.getId()){
            case R.id.btnDireccion:
                     nombrep = nombreU.getText().toString();
                     emailp = emailU.getText().toString();
                     passp= passU.getText().toString();

                break;
        }
        Intent i = new Intent(this,Main2ActivityVentana.class);
            i.putExtra("userNombre",nombrep);
            i.putExtra("userEmail",emailp);
            i.putExtra("userPass",passp);
        startActivity(i);
    }

}
