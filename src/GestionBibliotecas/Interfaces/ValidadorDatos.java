package GestionBibliotecas.Interfaces;

import java.util.ArrayList;
import GestionBibliotecas.Libro;

public interface ValidadorDatos{

    boolean validarEntrada(String entrada);
    void mensajeError();
    default boolean ValidarIsbnTituloAutorRepetido(ArrayList<Libro> listaLibros, String isbn, String titulo, String autor){
        for(Libro libro : listaLibros){
            return !(libro.getISBN().equalsIgnoreCase(isbn)) && !(libro.getTitulo().equalsIgnoreCase(titulo) && libro.getAutor().equalsIgnoreCase(autor));
        }
        return false;
    }
}
