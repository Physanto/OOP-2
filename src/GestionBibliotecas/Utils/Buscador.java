package GestionBibliotecas.Utils;

import java.util.ArrayList;

public interface Buscador<T, E>{

    ArrayList<T> buscarCriterio(ArrayList<T> lista, E dato);
    void mostrarMensajeError();
}
