/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7.pkg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author liooficial
 */
public class LeerTeclado {
    public static String leerCadena(String mensaje) throws IOException{
        
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        
       
        System.out.println(mensaje);
        String cadena = br.readLine();
        
        //int valor = Integer.parseInt(nombre);
        
        return cadena;
         //System.out.println("Hola " + nombre);
    }
    
    public static int leerEntero(String mensaje) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println(mensaje);
        String cadena = br.readLine();
        
        int numero = 0;
        try {
            numero = Integer.parseInt(cadena);
        } catch (NumberFormatException e) {
            System.out.println("Eso no fue un número, vuelve a intentarlo");
            numero = leerEntero(mensaje);
        }
        
        return numero;
    }
}
