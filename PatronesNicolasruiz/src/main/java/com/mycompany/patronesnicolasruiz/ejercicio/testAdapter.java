/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.patronesnicolasruiz.ejercicio;

/**
 *
 * @author nicos
 */
public class testAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PanelTV panel = new PanelTV();
        SmartPhone phone = new SmartPhone();
        AdapterSmartPhone  smartphone = new AdapterSmartPhone(phone);
        
        System.out.println("Comprobando funcionamiento panel TV *********************************");
        panel.apagar();
        System.out.println("Comprobando funcionamiento SmartPhone *********************************");
        smartphone.apagar();
        
        
    }
    
}
