package com.trejo.root.registrousuardirecciones;

import java.io.Serializable;

/**
 * Created by root on 21/11/15.
 */
public class Direccion implements Serializable {
    private String calle;
    private String colonia;
    private String cp;
    public Direccion(String calle, String colonia, String cp){
        this.calle = calle;
        this.colonia=colonia;
        this.cp=cp;
    }
    public String getCalle(){
        return this.calle;
    }
    public String getColonia(){
        return this.colonia;
    }
    public String getCp(){
        return this.cp;
    }
}
