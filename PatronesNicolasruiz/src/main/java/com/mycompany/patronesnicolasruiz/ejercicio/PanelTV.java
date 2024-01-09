/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesnicolasruiz.ejercicio;

/**
 *
 * @author nicos
 */
public class PanelTV extends DispositivoManipulacionTV{

    public PanelTV() {
    }
    
    @Override
    public void encender() {
        System.out.println("Encerder Panel TV");
    }

    @Override
    public void apagar() {
        System.out.println("apagar Panel TV");
    }

    @Override
    public void manipularVolumen() {
        System.out.println("manipular Volumen Panel TV");
    }

    @Override
    public void cambiarEntrada() {
        System.out.println("cambiar Entrada Panel TV");
    }
    
}
