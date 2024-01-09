package com.mycompany.patronesnicolasruiz.ejercicio;

/*
 * @author nicos
 */
public class AdapterSmartPhone extends DispositivoManipulacionTV {

    private SmartPhone smartPhone;

    public AdapterSmartPhone(SmartPhone SmartPhone) {
        this.smartPhone = SmartPhone;
    }

    @Override
    public void encender() {
        
        smartPhone.iniciarAplicacion();
        smartPhone.escanearDispositivosEnLaRed();
        smartPhone.seleccionarDispositivo();
        smartPhone.iniciarDispositivo();
        
        System.out.println("Encender SmartPhone");
    }

    @Override
    public void apagar() {
        smartPhone.iniciarAplicacion();
        smartPhone.escanearDispositivosEnLaRed();
        smartPhone.seleccionarDispositivo();
        smartPhone.detenerDispositivo();
        System.out.println("Apagar SmartPhone");
    }

    @Override
    public void manipularVolumen() {
        smartPhone.iniciarAplicacion();
        smartPhone.escanearDispositivosEnLaRed();
        smartPhone.seleccionarDispositivo();
        smartPhone.manipularVolumen();
        System.out.println("Manipular Volumen SmartPhone");
    }

    @Override
    public void cambiarEntrada() {
        smartPhone.iniciarAplicacion();
        smartPhone.escanearDispositivosEnLaRed();
        smartPhone.seleccionarDispositivo();
        smartPhone.cambiarEntrada();
        System.out.println("Cambiar Entrada SmartPhone");
    }

}
