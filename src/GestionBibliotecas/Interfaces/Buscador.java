package GestionBibliotecas.Interfaces;

import java.util.ArrayList;
import GestionBibliotecas.Libro;

public interface Buscador{

    Libro buscarCriterio(ArrayList<Libro> lista, String dato);
    void mostrarMensajeError();
}
