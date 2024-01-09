/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bibliotecanicolasruiz.ejercicio;

/**
 *
 * @author nicos
 */
public class testMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Biblioteca biblioteca;
        biblioteca = new Biblioteca() {};
        Libro libro = new Libro(1111, "El principito", true);
        Libro libro1 = new Libro(2222, "Muertes de una cronica anunciada", false);
        Libro libro2 = new Libro(3333, "Mial años de soledad", true);
        
        Revista  revista = new Revista(1212, TiposRevista.TIPOUNO, 001, "Revisa uno", true);
        Revista  revista2 = new Revista(1313, TiposRevista.TIPODOS, 002, "Revisa uno", true);
                
       
    }
    
}
