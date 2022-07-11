/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7.pkg1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author liooficial
 */
public class EscrituraTexto {
    public static void main(String args[])
    {
        /*
        
        String dicho = null;
        File f = new File("dichos.txt");
        try{
        dicho = LeerTeclado.leerCadena("Escribe el dicho que deseas almacena: ");
        FileWriter fw = new FileWriter(f,true); 
        PrintWriter out = new PrintWriter(fw);
        out.println(dicho);
        out.flush(); 
        out.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        */
    }
    
    public static void escribirArchivo(String contenido)
    {
        File f = new File("autor.txt");
        try{
        FileWriter fw = new FileWriter(f,true); 
        PrintWriter out = new PrintWriter(fw);
        out.println(contenido);
        out.flush(); 
        out.close(); 
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void escribirArchivo1(String contenido)
    {
        File f = new File("libro.txt");
        try{
        FileWriter fw = new FileWriter(f,true); 
        PrintWriter out = new PrintWriter(fw);
        out.println(contenido);
        out.flush(); 
        out.close(); 
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}