package GestionBibliotecas.Utils;

import java.util.ArrayList;

import GestionBibliotecas.Modelo.BuscarPorCriterio;
import GestionBibliotecas.Modelo.Libro;

public class ListaBuscadores {

    public static ArrayList<Buscador<Libro, String>> getListaBuscadores(){

        ArrayList<Buscador<Libro, String>> listaBuscadores = new ArrayList<>();

        listaBuscadores.add(new BuscarPorCriterio.BuscarPorISBN());
        listaBuscadores.add(new BuscarPorCriterio.BuscarPorTitulo());
        listaBuscadores.add(new BuscarPorCriterio.BuscarPorAutor());
        listaBuscadores.add(new BuscarPorCriterio.BuscarPorAnno());
        listaBuscadores.add(new BuscarPorCriterio.BuscarDisponible());

        return listaBuscadores;
    }
}
