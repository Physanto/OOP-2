package GestionBibliotecas.Interfaces;

import java.util.ArrayList;
import GestionBibliotecas.Libro;

public interface Buscador{

    boolean buscarCriterio(ArrayList<Libro> lista, String dato);
    void mostrarMensaje();
}
