package GestionBibliotecas;

import java.util.Scanner;

import GestionBibliotecas.Interfaces.Buscador;

public class Biblioteca {

    Scanner stdin;
    private Inventario inventario;

    public Biblioteca(){
        this.stdin = new Scanner(System.in);
        this.inventario = new Inventario();
    }

    public void almacenarLibro(Libro libro){
        inventario.almacenarLibros(libro);
    }

    public void buscarLibro(String dato, Buscador buscador){
        inventario.buscarLibro(buscador, dato);
    }
    
    public void librosDisponibles(){
        inventario.librosDisponibles();
    }
}
