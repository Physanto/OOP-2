package GestionBibliotecas.Utils;

import java.util.ArrayList;
import GestionBibliotecas.Modelo.Libro;
import GestionBibliotecas.Modelo.Usuario;

public interface ValidadorDatos {

    boolean validarEntrada(String entrada);
    void mensajeError();

    default boolean ValidarIsbnTituloAutorRepetido(ArrayList<Libro> listaLibros, String isbn, String titulo, String autor){

        for(Libro libro : listaLibros){
            if(libro.getISBN().equalsIgnoreCase(isbn) || (libro.getTitulo().equalsIgnoreCase(titulo) && libro.getAutor().equalsIgnoreCase(autor))){
                return false;
            }
        }
        return true;
    }

    default boolean validarIdRepetido(ArrayList<Usuario> listaUsuarios, String id){
        
        for(Usuario usuario : listaUsuarios){

            if(usuario.getID().equals(id)){
                return false;
            }
        }
        return true;
    }
}
