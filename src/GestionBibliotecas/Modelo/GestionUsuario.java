package GestionBibliotecas.Modelo;

import GestionBibliotecas.Utils.Validador;
import GestionBibliotecas.Utils.Buscador;

import java.util.ArrayList;

public class GestionUsuario{

    private ArrayList<Usuario> listaUsuarios;

    public GestionUsuario(){
        this.listaUsuarios = new ArrayList<>();
    }

    public void almacenarLibroPrestado(Libro libro, Usuario usuario){
        usuario.ingresarLibroLista(libro);
    }

    public ArrayList<Usuario> buscarUsuario(Buscador<Usuario, String> buscador, String dato){
        return buscador.buscarCriterio(listaUsuarios, dato);
    }

    public void devolverLibro(Usuario usuario, Libro libro){
        eliminarLibroListaUsuario(usuario, libro);
    }  

    public void eliminarLibroListaUsuario(Usuario usuario, Libro libro){
        ArrayList<Libro> lista = usuario.getListaLibros();
        lista.remove(libro);
    }

    public ArrayList<Libro> mostrarListaLibrosPorUsuario(Usuario usuario){
        return usuario.getListaLibros();
    }

    public boolean validarInformacion(String id){

        Validador validadorDatos = new ValidarDatos.ValidarDatoVacio();

        return validadorDatos.validarIdRepetido(listaUsuarios, id);
    }

    public boolean crearUsuario(String id, String nombre, String edad){
        ArrayList<Libro> lista = new ArrayList<>();
        if(validarInformacion(id)){
            listaUsuarios.add(new Usuario(id, nombre, Byte.parseByte(edad), lista));
            return true;
        }
        return false;
    }

    public ArrayList<Usuario> listarTodosUsuarios(){
        return listaUsuarios;
    }
    
    public boolean validarListaVacia(ArrayList<Usuario> lista){
        return lista.isEmpty();
    }

    public void listarUsuariosConLibrosPrestados(){

        for(Usuario usuario : listaUsuarios){
            System.out.println("libros prestados por el usuario " + usuario.getNombre() + "\n");
            for(Libro libro : usuario.getListaLibros()){
                System.out.println(libro.toString());
            }
        }
    }

    public void eliminarUsuario(Usuario usuario){
        listaUsuarios.remove(usuario);
    } 
}
