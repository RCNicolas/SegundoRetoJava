
package com.mycompany.bibliotecanicolasruiz.ejercicio;

/*
 * @author nicos
 */
public enum TiposRevista {
    
    TIPOUNO("Tipo uno", "Revista de tipo uno"),
    TIPODOS("Tipo dos", "Revista de tipo dos"),
    TIPOTRES("Tipo tres", "Revista de tipo tres"), 
    TIPOCUATRO("Tipo cuatro", "Revista de tipo cuatro"), 
    TIPOCINCO("Tipo cinco", "Revista de tipo cinco");
    
    private String nombre;
    private String descripcion;

    private TiposRevista(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
