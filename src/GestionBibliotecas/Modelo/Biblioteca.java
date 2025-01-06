package GestionBibliotecas.Modelo;

import java.util.Scanner;
import java.util.ArrayList;
import GestionBibliotecas.Utils.Buscador;

public class Biblioteca {

    Scanner stdin;
    private Inventario inventario;

    public Biblioteca(){
        this.stdin = new Scanner(System.in);
        this.inventario = new Inventario();
    }

    public ArrayList<Libro> getListaLibros(){
        return inventario.getListaLibros();
    }

    public void almacenarLibro(Libro libro){
        inventario.almacenarLibros(libro);
    }

    public ArrayList<Libro> buscarLibro(Buscador buscador, String dato){ 
        ArrayList<Libro> lista = inventario.buscarLibro(buscador, dato);
        return lista;
    }
    
    public ArrayList<Libro> librosDisponibles(Buscador buscador, String dato){
        ArrayList<Libro> lista = inventario.librosDisponibles(buscador, dato);
        return lista;
    }

    public void libroPrestado(Libro libro){
        inventario.libroPrestado(libro);
    }
}
