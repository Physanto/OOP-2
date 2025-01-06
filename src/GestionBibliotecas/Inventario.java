package GestionBibliotecas;

import GestionBibliotecas.Utils.Buscador;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Libro> listaLibros;

    public Inventario(){
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
}

