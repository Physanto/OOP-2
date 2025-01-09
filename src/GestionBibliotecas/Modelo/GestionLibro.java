package GestionBibliotecas.Modelo;

import GestionBibliotecas.Utils.Buscador;
import GestionBibliotecas.Vista.Biblioteca;

import java.util.ArrayList;

public class GestionLibro {

    private ArrayList<Libro> listaLibros;

    public GestionLibro(){
        this.listaLibros = new ArrayList<>();
    }

    public ArrayList<Libro> getListaLibros(){
        return listaLibros;
    }

    public void almacenarLibros(Libro libro){
        listaLibros.add(libro);
    }

    public ArrayList<Libro> buscarLibro(Buscador buscador, String dato){
        ArrayList<Libro> lista = buscador.buscarCriterio(listaLibros, dato);
        return lista;
    } 

    public ArrayList<Libro> librosDisponibles(Buscador buscador, String dato){
        ArrayList<Libro> lista = buscador.buscarCriterio(listaLibros, dato);
        return lista;
    }

    public void libroPrestado(Libro libro){
        libro.setDisponible(false);
    } 

    public Libro libroAPrestar(String isbn){

        for(Libro libro : listaLibros){
            if(libro.getISBN().equals(isbn)){
                libroPrestado(libro);
                return libro;
            }
        }
        return null;
    }
}

