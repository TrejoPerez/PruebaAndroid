package com.trejo.root.registrousuardirecciones;

import java.io.Serializable;

/**
 * Created by root on 21/11/15.
 */
public class Usuario implements Serializable{
    private String nombre;
    private String correo;
    private String password;
    private Direccion direccion;
    public Usuario(String nombre,String correo, String password,Direccion direccion){
        this.nombre=nombre;
        this.correo=correo;
        this.password=password;
        this.direccion=direccion;

    }
    public String getNombre(){
        return this.nombre;
    }
    public String getCorreo(){
        return this.correo;
    }
    public String getPassword(){
        return  this.password;
    }
    public Direccion getDireccion(){
        return this.direccion;
    }

}
