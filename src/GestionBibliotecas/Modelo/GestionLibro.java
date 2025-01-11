package GestionBibliotecas.Modelo;

import GestionBibliotecas.Utils.Buscador;
import java.util.ArrayList;

public class GestionLibro {

    private ArrayList<Libro> listaLibros; 
    private Libro libro;

    public GestionLibro(){
        this.listaLibros = new ArrayList<>();
    }

    public ArrayList<Libro> getListaLibros(){
        return listaLibros;
    }

    public void almacenarLibros(Libro libro){
        listaLibros.add(libro);
    }

    public ArrayList<Libro> buscarLibro(Buscador<Libro, String> buscador, String dato){
        return buscador.buscarCriterio(listaLibros, dato);
    } 

    public ArrayList<Libro> librosDisponibles(Buscador<Libro, String> buscador, String dato){
        return buscador.buscarCriterio(listaLibros, dato);
    }

    public void modificarEstadoLibro(Libro libro, boolean estado){
                                                //en la lista sino solo en el libro en si, esto quiere decir que verdaderamente yo cuando
                                                //creo una lista de libros lo que verdaderamente estoy haciendo es tener una copia de este.
        libro.setDisponible(estado); 
    } 
}

