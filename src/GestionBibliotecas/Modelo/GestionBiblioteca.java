package GestionBibliotecas.Modelo;

import java.util.ArrayList;
import GestionBibliotecas.Utils.Buscador;

public class GestionBiblioteca {
    private GestionLibro gestionLibro;

    public GestionBiblioteca(){
        this.gestionLibro = new GestionLibro();
    }

    public ArrayList<Libro> getListaLibros(){
        return gestionLibro.getListaLibros();
    }

    public void almacenarLibro(Libro libro){
        gestionLibro.almacenarLibros(libro);
    }

    public ArrayList<Libro> buscarLibro(Buscador buscador, String dato){ 
        return gestionLibro.buscarLibro(buscador, dato);
    }
    
    public ArrayList<Libro> librosDisponibles(Buscador buscador, String dato){
        return gestionLibro.librosDisponibles(buscador, dato);
    }

    public void modificarEstadoLibro(String isbn){
        gestionLibro.modificarEstadoLibro(isbn);
    }

    public String libroAPrestar(String isbn){
        return gestionLibro.libroAPrestar(isbn);
    }

}
