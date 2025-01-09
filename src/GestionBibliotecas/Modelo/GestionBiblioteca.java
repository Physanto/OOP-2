package GestionBibliotecas.Modelo;

import java.util.Scanner;
import java.util.ArrayList;
import GestionBibliotecas.Utils.Buscador;

public class GestionBiblioteca {

    Scanner stdin;
    private GestionLibro gestionLibro;

    public GestionBiblioteca(){
        this.stdin = new Scanner(System.in);
        this.gestionLibro = new GestionLibro();
    }

    public ArrayList<Libro> getListaLibros(){
        return gestionLibro.getListaLibros();
    }

    public void almacenarLibro(Libro libro){
        gestionLibro.almacenarLibros(libro);
    }

    public ArrayList<Libro> buscarLibro(Buscador buscador, String dato){ 
        ArrayList<Libro> lista = gestionLibro.buscarLibro(buscador, dato);
        return lista;
    }
    
    public ArrayList<Libro> librosDisponibles(Buscador buscador, String dato){
        ArrayList<Libro> lista = gestionLibro.librosDisponibles(buscador, dato);
        return lista;
    }

    public void libroPrestado(Libro libro){
        gestionLibro.libroPrestado(libro);
    }

    public Libro libroAPrestar(String isbn){
        return gestionLibro.libroAPrestar(isbn);
    }

}
