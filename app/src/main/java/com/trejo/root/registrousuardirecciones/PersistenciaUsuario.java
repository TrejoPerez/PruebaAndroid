package com.trejo.root.registrousuardirecciones;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Created by root on 21/11/15.
 */
public class PersistenciaUsuario  {
    public static void guardarUsuario(Usuario u){
        ArrayList<Usuario> usuario = new ArrayList<Usuario>();
        File f = new File("Usuarios");
        try {


            if (f.exists()) usuario = leerUsuario();
            FileOutputStream fis = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fis);
            usuario.add(u);
            oos.writeObject(usuario);


        }catch(Exception e){

        }

    }
    public static ArrayList<Usuario> leerUsuario(){
        ArrayList<Usuario> usuario = new ArrayList<Usuario>();
        try{
            File f = new File("Usuarios");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            usuario = (ArrayList<Usuario>)ois.readObject();
        }catch(Exception e){

        }
        return usuario;
    }
    public static Usuario leerId(int i){
        ArrayList<Usuario> usuario = new ArrayList<Usuario>();
        Usuario u=null;
        try{
            File f = new File("Usuarios");
            if(f.exists())usuario = leerUsuario();
            u = usuario.get(i);
        }catch(Exception e){

        }
        return u;
    }

}
