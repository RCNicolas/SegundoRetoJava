
package com.mycompany.bibliotecanicolasruiz.ejercicio;

import java.util.Set;

/**
 *
 * @author nicos
 */
public class Revista extends Recurso{
    
    public int numero;
    public TiposRevista tipo;

    public Revista(int numero, TiposRevista tipo, int id, String titulo, boolean disponible) {
        super(id, titulo, disponible);
        this.numero = numero;
        this.tipo = tipo;
    }

 
    
  
    
}
