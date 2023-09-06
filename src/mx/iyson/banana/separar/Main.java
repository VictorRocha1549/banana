/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.iyson.banana.separar;

import java.util.Scanner;

/**
 *Dada una cadena de texto dividida por comas y espacio, es necesario dividir cada fracción y declarar id + nombre y apellido
 * para esto se utiliza el metodo de split.
 * para ello se crea una array que guarda las fracciones dividadas por comas, posterior a esto a traves del ciclo for guarde estas fracciones
 * las cuales nuevamente serán divididas y gardadas en otra array pero ahora por espacios.
 * Y para mostrar los resultasultados vemos que las posiciones de la array teneniendo como primer posicion el id = 0 y así consecutivamente
 * @author vagui Victor Rocha
 */
public class Main {
    

   public static void main(String[] args){
       System.out.println("Escriba la oracion a separar: ");
       Scanner scanner = new Scanner(System.in);
        String oracionn = scanner.nextLine();
        
        
        String [] resultado2 = oracionn.split(",");
       for (String s : resultado2){ 
           String [] partes = s.split(" ");
           String id = partes[0];
            String nombre = partes[3] + " " + partes[1];
            System.out.println("ID: " + id);
            System.out.println("Nombre: " + nombre);
       }


   }
}

