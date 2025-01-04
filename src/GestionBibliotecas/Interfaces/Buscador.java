package GestionBibliotecas.Interfaces;

import java.util.ArrayList;
import GestionBibliotecas.Libro;

public interface Buscador{

    ArrayList<Libro> buscarCriterio(ArrayList<Libro> lista, String dato);
    void mostrarMensajeError();
}
