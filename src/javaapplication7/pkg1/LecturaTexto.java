/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7.pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author liooficial
 */
public class LecturaTexto {
    public static void main(String args[]) {
     
    }
    
    public static String leerArchivo(String archivo) {
        File f = new File(archivo);
        String contenido = "";
        if (f.exists()) //Comprobación obligada para 
        {           //asegurar integridad de la aplicación
            try {
                FileReader fr = new FileReader(f); //crear canal de comunicacion
                BufferedReader bf = new BufferedReader(fr);
                String cadena;
                while ((cadena = bf.readLine()) != null) {
                    //System.out.println(cadena);
                    contenido += cadena + "\n";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("El archivo no existe!!!");
        }
        return contenido;
    }
}
