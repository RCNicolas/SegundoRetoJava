
package com.mycompany.patronesnicolasruiz.ejercicio;

/**
 *
 * @author nicos
 */
public class ControlInfrarrojo extends DispositivoManipulacionTV{

    @Override
    public void encender() {
        System.out.println("Encerder infrarrojo");
    }

    @Override
    public void apagar() {
        System.out.println("apagar infrarrojo");
    }

    @Override
    public void manipularVolumen() {
        System.out.println("manipular Volumen infrarrojo");
    }

    @Override
    public void cambiarEntrada() {
        System.out.println("cambiar Entrada infrarrojo");
    }
    
}
