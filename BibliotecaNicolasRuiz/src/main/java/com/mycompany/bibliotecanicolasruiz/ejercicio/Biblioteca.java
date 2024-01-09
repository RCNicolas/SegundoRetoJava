package com.mycompany.bibliotecanicolasruiz.ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * @author nicos
 */
public abstract class Biblioteca extends Recurso implements PrestarRecurso, BuscarRecurso {

    private List<Recurso> recursoDisponible;
    public Recurso recurso;

    Scanner scanner = new Scanner(System.in);

    public Biblioteca(List<Recurso> recursoDisponible, Recurso recurso, int id, String titulo, boolean disponible) {
        super(id, titulo, disponible);
        this.recursoDisponible = recursoDisponible;
        this.recurso = recurso;
    }

    public void Biblioteca() {
        this.recursoDisponible = new ArrayList<>();
    }

    public void registrarrecurso(Recurso recurso) {
        recursoDisponible.add(recurso);
    }

    @Override
    public void prestarRecursos() {

        System.out.println("Ingrese el id del recurso que desea: ");
        int numero = scanner.nextInt();

        if (recurso.getId() == numero) {
            System.out.println("Recurso encontrado");
            if (recurso.isDisponible() == true) {
                System.out.println("Recurso disponible");
                recurso.setDisponible(false);
            } else if (recurso.isDisponible() == false) {
                System.out.println("Recurso no disponible");
                recurso.setDisponible(false);
            }
        } else {
            System.out.println("Recurso no encontrado ");
        }

    }

    @Override
    public String buscarRecursoPorTitulo() {
        System.out.println("Ingrese el titulo del recurso que desea buscar");
        return null;
    }

    public List<Recurso> getRecursoDisponibles() {
        return recursoDisponible;
    }

    public void setRecursoDisponible(List<Recurso> recursoDisponibles) {
        this.recursoDisponible = recursoDisponibles;
    }
}
