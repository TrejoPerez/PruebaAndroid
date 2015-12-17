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

public class BusacrUporId extends AppCompatActivity implements View.OnClickListener{
    EditText id;
    TextView error;
    TextView nombre;
    TextView correo;
    TextView password;
    Button btnBuscarIdU;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busacr_upor_id);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        id=(EditText) findViewById(R.id.idUser);
        nombre=(TextView)findViewById(R.id.labelIdNombre);
        correo=(TextView)findViewById(R.id.labelIdCorreo);
        password=(TextView)findViewById(R.id.labelIdPassword);
        error=(TextView)findViewById((R.id.labelErrorId));
        btnBuscarIdU = (Button) findViewById(R.id.btnBuscarIdUser);
        btnBuscarIdU.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.btnBuscarIdUser:
                try {
                    int i = 0;
                    i = Integer.parseInt(id.getText().toString());
                    PersistenciaUsuario.leerId(i);
                    nombre.setText(PersistenciaUsuario.leerId(i).getNombre());
                    correo.setText(PersistenciaUsuario.leerId(i).getCorreo());
                    //password.setText(PersistenciaUsuario.leerId(i).getPassword());

                    break;
                }catch(Exception e){
                        //error.setText("Hubo un error "+e);
                    error.setText("Arreglo :"+PersistenciaUsuario.leerUsuario().size());
                }
        }

    }
}
