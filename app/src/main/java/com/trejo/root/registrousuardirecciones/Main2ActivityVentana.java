package com.trejo.root.registrousuardirecciones;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2ActivityVentana extends AppCompatActivity implements View.OnClickListener{
    Bundle b;
    EditText callep;
    EditText coloniap;
    EditText cpP;
    TextView estado;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_activity_ventana);
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


        callep= (EditText) findViewById(R.id.textCalle);
        coloniap = (EditText) findViewById(R.id.textColonia);
        cpP=(EditText) findViewById(R.id.textCp);
        btnRegister = (Button) findViewById(R.id.btnRegistrar);
        btnRegister.setOnClickListener(this);
        estado = (TextView) findViewById(R.id.textRegistrado);

        /*
            b=getIntent().getExtras();
            nombres=b.getString("userNombre");
            text1.setText(nombres);
        */


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnRegistrar:

                    b=getIntent().getExtras();
                    String calleU=callep.getText().toString();
                    String coloniaU=coloniap.getText().toString();
                    String cpU=cpP.getText().toString();
                    Direccion d= new Direccion(calleU,coloniaU,cpU);
                    Usuario user= new Usuario(b.getString("userNombre"),b.getString("userEmail"),b.getString("userPass"),d);
                    PersistenciaUsuario.guardarUsuario(user);
                    //estado.setText("Registrado");
                int i = PersistenciaUsuario.leerUsuario().size();
                estado.setText("El arreglo es de "+i);




                break;
        }


    }
}
